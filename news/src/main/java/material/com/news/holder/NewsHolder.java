package material.com.news.holder;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import material.com.news.databinding.NewsItemBinding;

/**
 * Created by zjl on 2017/3/27.
 */
@Keep
public class NewsHolder extends RecyclerView.ViewHolder{
    private ViewDataBinding binding;

    public NewsHolder(View itemView) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);
    }

    public NewsHolder(NewsItemBinding binding) {
        super(binding.getRoot());
        setBinding(binding);
    }

    public ViewDataBinding getBinding() {
        return binding;
    }

    public void setBinding(ViewDataBinding binding) {
        this.binding = binding;
    }
}
