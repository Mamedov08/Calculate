package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick;
    private String Operation;
    private Integer Resalt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }
    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                setNumber("1");
                break;

            case R.id.btn_two:
                setNumber("2");
                break;

            case R.id.btn_three:
                setNumber("3");
                break;

            case R.id.btn_four:
                setNumber("4");
                break;
            case R.id.btn_five:
                setNumber("5");
                break;
            case R.id.btn_six:
                setNumber("6");
                break;
            case R.id.btn_seven:
                setNumber("7");
                break;
            case R.id.btn_eight:
                setNumber("8");
                break;
            case R.id.btn_nine:
                setNumber("9");
                break;

            case R.id.btn_zero:
                setNumber("0");
                break;


            case R.id.btn_clear:
                //очищение2w
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClick = false;
    }

    private void setNumber(String number) {
        if (textView.getText().toString().equals("0")) {
            textView.setText(number);
        } else if (isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }


    }
    public void onOperationClick(View view){
        switch (view.getId()){
            case R.id.btn_plus:
                Operation = "+";
                first = Integer.parseInt(textView.getText().toString());
                // нажал на плюс
                break;
            case R.id.btn_min:
                Operation = "-";
                first = Integer.parseInt(textView.getText().toString());
                break;
            case R.id.btn_X:
                Operation = "*";
                first = Integer.parseInt(textView.getText().toString());
                break;
            case R.id.btn_dil:
                Operation = "/";
                first = Integer.parseInt(textView.getText().toString());
                break;

            case R.id.btn_equal:
                second = Integer.parseInt(textView.getText().toString());
                switch (Operation){
                    case "+":
                        Resalt = first + second;
                        break;
                    case "-":
                        Resalt = first - second;
                        break;
                    case "*":
                        Resalt = first * second;
                        break;
                    case "/":
                        Resalt = first / second;
                        break;

                }
                textView.setText(Resalt.toString());

        }
        isOperationClick = true;
    }

}