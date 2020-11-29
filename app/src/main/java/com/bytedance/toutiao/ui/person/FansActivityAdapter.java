package com.bytedance.toutiao.ui.person;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.bytedance.toutiao.R;
import com.bytedance.toutiao.bean.MessageCommentModel;
import com.bytedance.toutiao.databinding.ItemFansBinding;

import java.util.ArrayList;
import java.util.List;

public class FansActivityAdapter  extends RecyclerView.Adapter<FansActivityAdapter.ViewHolder>{
    private Context context;
    private List<MessageCommentModel> fans;

    public FansActivityAdapter(Context context, List<MessageCommentModel> fans) {
        this.context = context;
        this.fans = fans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_fans, parent, false);
        FansActivityAdapter.ViewHolder myHolder = new FansActivityAdapter.ViewHolder(binding.getRoot());
        myHolder.setBinding(binding);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemFansBinding binding = (ItemFansBinding) holder.getBinding();
        binding.tvName.setText(fans.get(position).getMsgCommentUserName());
    }


    @Override
    public int getItemCount() {
        return fans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ViewDataBinding binding;
        public ViewDataBinding getBinding(){
            return binding;
        }

        public void setBinding(ViewDataBinding binding){
            this.binding = binding;
        }

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
