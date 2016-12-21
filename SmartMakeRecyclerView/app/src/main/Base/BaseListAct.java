

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public abstract class BaseListAct<T extends CDataType> extends AppBaseAct {

    private RecyclerView mRecyclerView;
    private BaseAdapter001 mAdapter;
    private LinearLayoutManager mLayoutManager;

    protected List<T> dataList = new ArrayList<>();

    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(layoutId());
        makeDate();

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new BaseAdapter001(appCtx, dataList);
        mRecyclerView.setAdapter(mAdapter);

    }

    protected abstract void makeDate();

    protected  int layoutId(){
        return R.layout.act_card_detail_list;
    }

}