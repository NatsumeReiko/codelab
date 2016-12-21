
import android.support.v7.widget.RecyclerView;
import android.view.View;

abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bandData(final T data, final View.OnClickListener clickListener);

}
