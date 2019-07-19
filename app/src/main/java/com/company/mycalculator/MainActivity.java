package com.company.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9,button10, buttonAdd, buttonSub, buttonDivision,
            buttonMult, buttonC, buttonEqual;
    private EditText editText;

    private float mValueOne, mValueTwo;

    private boolean add, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.zero_btn);
        button1 = (Button) findViewById(R.id.one_btn);
        button2 = (Button) findViewById(R.id.two_btn);
        button3 = (Button) findViewById(R.id.three_btn);
        button4 = (Button) findViewById(R.id.four_btn);
        button5 = (Button) findViewById(R.id.five_btn);
        button6 = (Button) findViewById(R.id.six_btn);
        button7 = (Button) findViewById(R.id.seven_btn);
        button8 = (Button) findViewById(R.id.eight_btn);
        button9 = (Button) findViewById(R.id.nine_btn);
        buttonAdd = (Button) findViewById(R.id.plus_btn);
        buttonSub = (Button) findViewById(R.id.minus_btn);
        buttonMult = (Button) findViewById(R.id.mult_btn);
        buttonDivision = (Button) findViewById(R.id.division_btn);
        buttonC = (Button) findViewById(R.id.clear_btn);
        buttonEqual = (Button) findViewById(R.id.equal_btn);
        editText = (EditText) findViewById(R.id.display_tv);
        button10 = (Button) findViewById(R.id.point_btn);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    add = true;
                    editText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                sub = true;
                editText.setText(null);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                mult = true;
                editText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                div = true;
                editText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editText.getText() + "");

                if (add == true) {
                    editText.setText(mValueOne + mValueTwo + "");
                    add = false;
                }

                if (sub == true) {
                    editText.setText(mValueOne - mValueTwo + "");
                    sub = false;
                }

                if (mult == true) {
                    editText.setText(mValueOne * mValueTwo + "");
                    mult = false;
                }

                if (div == true) {
                    editText.setText(mValueOne / mValueTwo + "");
                    div = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
    }
}
