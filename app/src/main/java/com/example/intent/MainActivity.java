package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_submove;
    private EditText et_text;
    private String str; //빈 문자열 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_text = findViewById(R.id.et_text);
        btn_submove = findViewById(R.id.btn_submove);
        btn_submove.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                str = et_text.getText().toString(); //string 형태로 변환
                //str이 onClick이 실행됫을 때 있어야 함.
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("str",str);
                startActivity(intent);
            }
        });
    }
}
