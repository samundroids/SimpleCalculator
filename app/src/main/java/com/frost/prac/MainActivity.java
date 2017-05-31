package com.frost.prac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

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

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_equals.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_0:
            case R.id.btn_1:
            case R.id.btn_2:
            case R.id.btn_3:
            case R.id.btn_4:
            case R.id.btn_5:
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_8:
            case R.id.btn_9:
                Button btn = (Button) findViewById(v.getId());
                et_input_area.setText(et_input_area.getText() + btn.getText().toString());
                break;
            case R.id.btn_plus:
                if (et_input_area == null) {
                    et_input_area.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(et_input_area.getText()+"");
                    mPlus = true;
                    et_input_area.setText(null);
                }
                break;
            case R.id.btn_minus:
                if (et_input_area == null) {
                    et_input_area.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(et_input_area.getText()+"");
                    mMinus = true;
                    et_input_area.setText(null);
                }
                break;
            case R.id.btn_divide:
                if (et_input_area == null) {
                    et_input_area.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(et_input_area.getText()+"");
                    mDivide = true;
                    et_input_area.setText(null);
                }
                break;
            case R.id.btn_multiply:
                if (et_input_area == null) {
                    et_input_area.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(et_input_area.getText()+"");
                    mMultiply = true;
                    et_input_area.setText(null);
                }
                break;
            case R.id.btn_equals:
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
                break;
            case R.id.btn_clear:
                et_input_area.setText("");
                break;
            case R.id.btn_dot:
                et_input_area.setText(et_input_area.getText()+".");
                break;
        }
    }
}
