
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.List;

public class BaseAdapter001<T extends CDataType>
        extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final LayoutInflater inflater;
    private List<T> dataList = new ArrayList<>();
    private final Context appCtx;
    private View.OnClickListener itemClicked;
    private int itemCount = 0;


    public BaseAdapter001(final Context appContext, List<T> original) {
        this.appCtx = appContext;
        inflater = LayoutInflater.from(appCtx);

        dataList.addAll(original);
        itemCount = dataList.size();

        itemClicked = makeListener();
    }


    @SuppressWarnings("unchecked")
    protected View.OnClickListener makeListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                final T data = (T) view.getTag();
                Toast.makeText(appCtx, "clicked:" + data.dataType, Toast.LENGTH_SHORT)
                        .show();
            }
        };
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case Constant.CARD_TYPE_001: {
                return new ViewHolder001(inflater
                        .inflate(R.layout.layout_data_type_001, parent, false));
            }
            case Constant.CARD_TYPE_002: {
                return new ViewHolder001(inflater
                        .inflate(R.layout.layout_data_type_002, parent, false));
            }
            default:
                throw new IllegalArgumentException("No Such type");
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof ViewHolder001) {
            ((ViewHolder001) holder).bandData(getData(position), itemClicked);
        }
    }

    private T getData(int position) {
        return dataList.get(position);
    }

    @Override
    public int getItemViewType(int position) {
        return getData(position).dataType;
    }

    @Override
    public int getItemCount() {
        return itemCount;
    }

}

