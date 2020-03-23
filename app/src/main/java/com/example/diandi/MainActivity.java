package com.example.diandi;

import android.os.Bundle;
import android.widget.RadioButton;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.diandi.base.BaseActivity;
import com.example.diandi.fragment.MyFragment;
import com.hjq.toast.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.tv_home_page)
    RadioButton tvHomePage;
    @BindView(R.id.tv_same_city)
    RadioButton tvSameCity;
    @BindView(R.id.tv_private_letter)
    RadioButton tvPrivateLetter;
    @BindView(R.id.tv_my)
    RadioButton tvMy;
    private FragmentTransaction transaction;


    @Override
    public int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData() {
         transaction = getSupportFragmentManager().beginTransaction();
         MyFragment myFragment=new MyFragment();
         transaction.add(R.id.framelayout_main,myFragment).commit();
    }

    private void initFragment() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_home_page)
    public void onTvHomePageClicked() {
        ToastUtils.show("主页");

    }

    @OnClick(R.id.tv_same_city)
    public void onTvSameCityClicked() {
        ToastUtils.show("同城");

    }

    @OnClick(R.id.tv_private_letter)
    public void onTvPrivateLetterClicked() {
        ToastUtils.show("私信");
    }

    @OnClick(R.id.tv_my)
    public void onTvMyClicked() {
        ToastUtils.show("我的");
    }
}
