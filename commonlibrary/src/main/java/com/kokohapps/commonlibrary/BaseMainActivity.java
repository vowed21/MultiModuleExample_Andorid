package com.kokohapps.commonlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by woo on 2017. 6. 8..
 */

public class BaseMainActivity extends AppCompatActivity {

    protected Button button;
    protected TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_base);

        this.textView = (TextView) findViewById(R.id.textView);

        this.button = (Button) findViewById(R.id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaseMainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
