package com.kokohapps.blueapp;

import android.support.v4.content.ContextCompat;
import android.os.Bundle;

import com.kokohapps.commonlibrary.AppManager;
import com.kokohapps.commonlibrary.BaseMainActivity;

public class BlueMainActivity extends BaseMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppManager.appType = AppManager.AppType.BlueApp;
        AppManager.themeColor = ContextCompat.getColor(this, R.color.colorPrimary);

        this.button.setTextColor(AppManager.themeColor);
        this.button.setText("블루앱 버튼");

        this.textView.setText("블루앱을 실행했군요!!");
    }
}
