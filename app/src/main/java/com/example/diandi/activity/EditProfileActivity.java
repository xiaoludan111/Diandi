package com.example.diandi.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diandi.R;
import com.example.diandi.base.BaseActivity;
import com.example.diandi.base.CustomTitleBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditProfileActivity extends BaseActivity {

    @BindView(R.id.titlebar)
    CustomTitleBar titlebar;
    @BindView(R.id.img_head_portrait)
    ImageView imgHeadPortrait;
    @BindView(R.id.tv_level)
    TextView tvLevel;
    @BindView(R.id.tv_id)
    TextView tvId;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.tv_nickname)
    TextView tvNickname;
    @BindView(R.id.tv_sex)
    TextView tvSex;
    @BindView(R.id.tv_autograph)
    TextView tvAutograph;

    @Override
    public int initLayout() {
        return R.layout.activity_edit_profile;
    }

    @Override
    protected void initView() {
        titlebar.setLeftIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 finish();
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }


}
