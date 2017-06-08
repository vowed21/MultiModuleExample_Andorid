package com.kokohapps.redapp;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.kokohapps.commonlibrary.AppManager;

import com.kokohapps.commonlibrary.BaseMainActivity;

public class RedMainMainActivity extends BaseMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppManager.appType = AppManager.AppType.RedApp;
        AppManager.themeColor = ContextCompat.getColor(this, R.color.colorPrimary);

        this.button.setTextColor(AppManager.themeColor);
        this.button.setText("레드앱 버튼");

        this.textView.setText("이 앱은 레드앱입니다.");
    }
}
