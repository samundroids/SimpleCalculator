package com.frost.prac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_plus, btn_minus,
            btn_divide, btn_multiply, btn_clear, btn_equals, btn_dot;

    EditText et_input_area;

    float mValueOne, mValueTwo;

    boolean mPlus, mMinus, mMultiply, mDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_equals = (Button) findViewById(R.id.btn_equals);
        btn_dot = (Button) findViewById(R.id.btn_dot);

        et_input_area = (EditText) findViewById(R.id.et_input_area);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+"9");
            }
        });


        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_input_area == null) {
                    et_input_area.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(et_input_area.getText()+"");
                    mPlus = true;
                    et_input_area.setText(null);
                }
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_input_area == null) {
                    et_input_area.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(et_input_area.getText()+"");
                    mMinus = true;
                    et_input_area.setText(null);
                }
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_input_area == null) {
                    et_input_area.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(et_input_area.getText()+"");
                    mDivide = true;
                    et_input_area.setText(null);
                }
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_input_area == null) {
                    et_input_area.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(et_input_area.getText()+"");
                    mMultiply = true;
                    et_input_area.setText(null);
                }
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(et_input_area.getText()+"");

                if (mPlus == true){
                    et_input_area.setText(mValueOne+mValueTwo+"");
                    mPlus = false;
                }

                if (mMinus == true){
                    et_input_area.setText(mValueOne-mValueTwo+"");
                    mPlus = false;
                }

                if (mDivide == true){
                    et_input_area.setText(mValueOne/mValueTwo+"");
                    mPlus = false;
                }

                if (mMultiply == true){
                    et_input_area.setText(mValueOne*mValueTwo+"");
                    mPlus = false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText("");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input_area.setText(et_input_area.getText()+".");
            }
        });


    }
}
