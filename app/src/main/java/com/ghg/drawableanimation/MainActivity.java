package com.ghg.drawableanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnStartCode;
    private Button mBtnStartXML;
    private ImageView mIvCode;
    private ImageView mIvXML;
    private AnimationDrawable mCodeAd;
    private AnimationDrawable mXmlAD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initListenr();
    }

    private void initView() {


        mBtnStartCode = (Button) findViewById(R.id.btnStartCode);
        mBtnStartXML = (Button) findViewById(R.id.btnStartXML);

        mIvCode = (ImageView) findViewById(R.id.ivCode);
        mIvXML = (ImageView) findViewById(R.id.ivXML);

    }

    private void initData() {

        initCodeFram();

        initXMLFram();

    }

    private void initXMLFram() {

        mXmlAD = (AnimationDrawable) getResources().getDrawable(R.drawable.loading);
        //为Image设置背景
        mIvXML.setBackgroundDrawable(mXmlAD);

    }

    private void initCodeFram() {
        mCodeAd = new AnimationDrawable();
        // 为AnimationDrawable添加动画帧
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_01),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_02),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_03),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_04),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_05),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_06),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_07),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_08),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_09),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_10),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_11),100);
        mCodeAd.addFrame(getResources().getDrawable(R.drawable.loading_img_12),100);
        //循环播放
        mCodeAd.setOneShot(false);
        //设置背景
        mIvCode.setBackgroundDrawable(mCodeAd);
    }

    private void initListenr() {
        mBtnStartCode.setOnClickListener(this);
        mBtnStartXML.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnStartCode:
                startCode();
                break;
            case R.id.btnStartXML:
                startXML();
                break;
        }
    }



    private void startCode() {

        if(mCodeAd!=null && !mCodeAd.isRunning()){
            mCodeAd.start();
        }else if(mCodeAd!=null && mCodeAd.isRunning()) {
            mCodeAd.stop();
        }


    }

    private void startXML() {
        if(mXmlAD!=null && !mXmlAD.isRunning()){
            mXmlAD.start();
        }else if(mXmlAD!=null && mXmlAD.isRunning()) {
            mXmlAD.stop();
        }
    }
}
