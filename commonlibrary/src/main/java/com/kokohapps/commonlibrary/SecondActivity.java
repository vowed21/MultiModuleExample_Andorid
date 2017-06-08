package com.kokohapps.commonlibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by woo on 2017. 6. 8..
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        TextView textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);

        //각 앱의 고유 테마색으로 변경.
        textView.setTextColor(AppManager.themeColor);
        button.setTextColor(AppManager.themeColor);

        //앱 타입마다 분기.

        if(AppManager.appType == AppManager.AppType.RedApp) {
            textView.setText("레드앱에서 실행시킨 세컨액티비티");
        }
        else if(AppManager.appType == AppManager.AppType.BlueApp) {
            textView.setText("블루앱에서 실행시킨 세컨액티비티");
        }

        button.setText("닫기");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
