package com.bytedance.toutiao.ui.fragment.video;

import android.os.Bundle;
import android.view.View;

import com.bytedance.toutiao.R;
import com.bytedance.toutiao.base.BaseFragment;
import com.bytedance.toutiao.ui.adapter.video.VideoDetailAdapter;
import com.bytedance.toutiao.ui.view.media.VideoPlayRecyclerView;

public class FragmentVideoNode extends BaseFragment {

    private VideoPlayRecyclerView mRvVideo;
    private VideoDetailAdapter adapter;

    public static FragmentVideoNode newFragment(){
        FragmentVideoNode fragmentVideoNode = new FragmentVideoNode();
        return fragmentVideoNode;
    }


    @Override
    protected int getContentViewId() {
        return R.layout.fragment_video_node;
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        initView();
    }

    @Override
    protected void setListener() {

    }

    @Override
    public void onClick(View view) {

    }

    private void initView() {

        mRvVideo = mContentView.findViewById(R.id.rv_video_detail);
        adapter = new VideoDetailAdapter(getActivity());
        mRvVideo.setAdapter(adapter);
    }
}
