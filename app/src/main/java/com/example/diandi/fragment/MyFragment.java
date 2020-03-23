package com.example.diandi.fragment;

import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diandi.R;
import com.example.diandi.activity.EditProfileActivity;
import com.example.diandi.activity.PartnerChannelActivity;
import com.example.diandi.activity.SettingActivity;
import com.example.diandi.base.BaseFragment;
import com.hjq.toast.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class MyFragment extends BaseFragment {
    @BindView(R.id.img_setting)
    ImageView imgSetting;

    @Override
    protected int setLayout() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.img_setting)
    public void onImgSettingClicked() {
        ToastUtils.show("编辑个人资料了");
        startActivity(new Intent(getContext(), PartnerChannelActivity.class));
    }


}
