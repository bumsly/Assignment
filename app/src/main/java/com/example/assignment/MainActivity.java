package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_s, button_f;
        EditText edt;
        TextView tv1, tv2;

        pref = getSharedPreferences("test", MODE_PRIVATE);
        editor = pref.edit();

        editor.putString("memo", "hello!");
        editor.commit();

        button_s = (Button) findViewById(R.id.btn_s);
        button_f = (Button) findViewById(R.id.btn_f);
        edt = (EditText) findViewById(R.id.edtx);
        tv1 = (TextView) findViewById(R.id.tv_name);
        tv2 = (TextView) findViewById(R.id.tv_number);

        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == button_s) {
                    Intent i = getIntent();
                    String name = i.getExtras().getString("name");
                    int number = i.getExtras().getInt("number");

                    pref = getSharedPreferences("test", MODE_PRIVATE);
                    editor = pref.edit();
                    String result = pref.getString("    memo", "");


                }else {
                    Intent intent = new Intent((getApplicationContext()), BsActivity.class);
                    startActivity(intent);
                }
            }
        };


        button_s.setOnClickListener(cl);
        button_f.setOnClickListener(cl);


    }
}