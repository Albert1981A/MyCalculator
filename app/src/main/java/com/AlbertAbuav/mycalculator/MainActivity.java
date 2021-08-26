package com.AlbertAbuav.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView value;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot;
    private Button btnClear, btnCalc, btnPlus, btnMinus, btnMultiply, btnDivision;
    private Button btnFactorial, btnMod, btnTilde;

    private ActionType actionType;

    private double firstNumber;
    private double secondNumber;
    private boolean dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dot = false;

        actionType = ActionType.NONE;

        value = (TextView) findViewById(R.id.value);

        btnClear = (Button) findViewById(R.id.btn_clear);
        btnFactorial = (Button) findViewById(R.id.btn_factorial);
        btnMod = (Button) findViewById(R.id.btn_mod);
        btnTilde = (Button) findViewById(R.id.btn_tilde);

        btn1 = (Button) findViewById(R.id.btn_one);
        btn2 = (Button) findViewById(R.id.btn_two);
        btn3 = (Button) findViewById(R.id.btn_three);
        btnPlus = (Button) findViewById(R.id.btn_plus);

        btn4 = (Button) findViewById(R.id.btn_four);
        btn5 = (Button) findViewById(R.id.btn_five);
        btn6 = (Button) findViewById(R.id.btn_six);
        btnMinus = (Button) findViewById(R.id.btn_minus);

        btn7 = (Button) findViewById(R.id.btn_seven);
        btn8 = (Button) findViewById(R.id.btn_eight);
        btn9 = (Button) findViewById(R.id.btn_nine);
        btnMultiply = (Button) findViewById(R.id.btn_multiply);

        btn0 = (Button) findViewById(R.id.btn_zero);
        btnDot = (Button) findViewById(R.id.btn_dot);
        btnCalc = (Button) findViewById(R.id.btn_calc);
        btnDivision = (Button) findViewById(R.id.btn_division);
    }

    public void clear(View view) {
        value.setText("0.0");
        dot = false;
        actionType = ActionType.NONE;
        firstNumber = 0.0;
        secondNumber = 0.0;
    }

    public void factorial(View view) {
    }

    public void mod(View view) {
    }

    public void tilde(View view) {
    }


    public void one(View view) {
        if(dot) {
            String v1 = value.getText().toString();
            if(v1.endsWith("0")){
                double res1 = Double.parseDouble(value.getText().toString());
                res1 = res1 + 0.1;
                value.setText("" + res1);
                return;
            }
            value.setText(value.getText() + "1");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10 + 1;
        value.setText("" + res);
    }

    public void two(View view) {
        if(dot) {
            String v1 = value.getText().toString();
            if(v1.endsWith("0")){
                double res1 = Double.parseDouble(value.getText().toString());
                res1 = res1 + 0.2;
                value.setText("" + res1);
                return;
            }
            value.setText(value.getText() + "2");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10 + 2;
        value.setText("" + res);
    }

    public void three(View view) {
        if(dot) {
            String v1 = value.getText().toString();
            if(v1.endsWith("0")){
                double res1 = Double.parseDouble(value.getText().toString());
                res1 = res1 + 0.3;
                value.setText("" + res1);
                return;
            }
            value.setText(value.getText() + "3");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10 + 3;
        value.setText("" + res);
    }

    public void plus(View view) {
        if(firstNumber != 0.0) {
//            secondNumber = Double.parseDouble(value.getText().toString());
//            double res = firstNumber + secondNumber;
//            value.setText("" + res);
//            actionType = ActionType.PLUS;
//            dot = false;
            calc(view);
            actionType = ActionType.PLUS;
            dot = false;
        }
        firstNumber = Double.parseDouble(value.getText().toString());
        actionType = ActionType.PLUS;
        dot = false;
        value.setText("0.0");
    }


    public void four(View view) {
        if(dot) {
            String v1 = value.getText().toString();
            if(v1.endsWith("0")){
                double res1 = Double.parseDouble(value.getText().toString());
                res1 = res1 + 0.4;
                value.setText("" + res1);
                return;
            }
            value.setText(value.getText() + "4");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10 + 4;
        value.setText("" + res);
    }

    public void five(View view) {
        if(dot) {
            String v1 = value.getText().toString();
            if(v1.endsWith("0")){
                double res1 = Double.parseDouble(value.getText().toString());
                res1 = res1 + 0.5;
                value.setText("" + res1);
                return;
            }
            value.setText(value.getText() + "5");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10 + 5;
        value.setText("" + res);
    }

    public void six(View view) {
        if(dot) {
            String v1 = value.getText().toString();
            if(v1.endsWith("0")){
                double res1 = Double.parseDouble(value.getText().toString());
                res1 = res1 + 0.6;
                value.setText("" + res1);
                return;
            }
            value.setText(value.getText() + "6");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10 + 6;
        value.setText("" + res);
    }

    public void minus(View view) {
        if(firstNumber != 0.0) {
//            secondNumber = Double.parseDouble(value.getText().toString());
//            double res = firstNumber - secondNumber;
//            value.setText("" + res);
//            actionType = ActionType.MINUS;
//            dot = false;
            calc(view);
            actionType = ActionType.MINUS;
            dot = false;
        }
        firstNumber = Double.parseDouble(value.getText().toString());
        actionType = ActionType.MINUS;
        dot = false;
        value.setText("0.0");
    }


    public void seven(View view) {
        if(dot) {
            String v1 = value.getText().toString();
            if(v1.endsWith("0")){
                double res1 = Double.parseDouble(value.getText().toString());
                res1 = res1 + 0.7;
                value.setText("" + res1);
                return;
            }
            value.setText(value.getText() + "7");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10 + 7;
        value.setText("" + res);
    }

    public void eight(View view) {
        if(dot) {
            String v1 = value.getText().toString();
            if(v1.endsWith("0")){
                double res1 = Double.parseDouble(value.getText().toString());
                res1 = res1 + 0.8;
                value.setText("" + res1);
                return;
            }
            value.setText(value.getText() + "8");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10 + 8;
        value.setText("" + res);
    }

    public void nine(View view) {
        if(dot) {
            String v1 = value.getText().toString();
            if(v1.endsWith("0")){
                double res1 = Double.parseDouble(value.getText().toString());
                res1 = res1 + 0.9;
                value.setText("" + res1);
                return;
            }
            value.setText(value.getText() + "9");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10 + 9;
        value.setText("" + res);
    }

    public void multiply(View view) {
        if(firstNumber != 0.0) {
//            secondNumber = Double.parseDouble(value.getText().toString());
//            double res = firstNumber * secondNumber;
//            value.setText("" + res);
//            actionType = ActionType.MULTIPLY;
//            dot = false;
            calc(view);
            actionType = ActionType.MULTIPLY;
            dot = false;
        }
        firstNumber = Double.parseDouble(value.getText().toString());
        actionType = ActionType.MULTIPLY;
        dot = false;
        value.setText("0.0");
    }


    public void zero(View view) {
        if(dot) {
            value.setText(value.getText() + "0");
            return;
        }
        double res = Double.parseDouble(value.getText().toString());
        res = res * 10;
        value.setText("" + res);
    }

    public void dot(View view) {
        if(dot = true){
            return;
        } else {
            dot = true;
        }
    }

    public void division(View view) {
        if(firstNumber != 0.0) {
//            secondNumber = Double.parseDouble(value.getText().toString());
//            double res = firstNumber / secondNumber;
//            value.setText("" + res);
//            actionType = ActionType.DIVISION;
//            dot = false;
            calc(view);
            actionType = ActionType.DIVISION;
            dot = false;
        }
        firstNumber = Double.parseDouble(value.getText().toString());
        actionType = ActionType.DIVISION;
        dot = false;
        value.setText("0.0");
    }

    public void calc(View view) {
        switch (actionType){
            case NONE:
                break;
            case PLUS:
                secondNumber = Double.parseDouble(value.getText().toString());
                double res = firstNumber + secondNumber;
                value.setText("" + res);
//                firstNumber = 0.0;
//                secondNumber = 0.0;
                actionType = ActionType.NONE;
                break;
            case MINUS:
                secondNumber = Double.parseDouble(value.getText().toString());
                double res2 = firstNumber - secondNumber;
                value.setText("" + res2);
//                firstNumber = 0.0;
//                secondNumber = 0.0;
                actionType = ActionType.NONE;
                break;
            case MULTIPLY:
                secondNumber = Double.parseDouble(value.getText().toString());
                double res3 = firstNumber * secondNumber;
                value.setText("" + res3);
//                firstNumber = 0.0;
//                secondNumber = 0.0;
                actionType = ActionType.NONE;
                break;
            case DIVISION:
                secondNumber = Double.parseDouble(value.getText().toString());
                double res4 = firstNumber / secondNumber;
                value.setText("" + res4);
//                firstNumber = 0.0;
//                secondNumber = 0.0;
                actionType = ActionType.NONE;
                break;
            default:
                System.out.println("ERROR");
        }
    }
}