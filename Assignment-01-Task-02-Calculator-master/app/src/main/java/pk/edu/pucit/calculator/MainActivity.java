package pk.edu.pucit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    TextView button00,button0,buttonDecimal,
            button1,button2,button3,
            button4,button5,button6,
            button7,button8,button9,
            buttonPlus,buttonMinus,buttonDivide,
            buttonMul,buttonAC,buttonMod,buttonDel,
            buttonEqual,equation,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Combining ID's with view

        button00 = (TextView) findViewById(R.id.no_00);
        button0 = (TextView) findViewById(R.id.no_0);
        button1 = (TextView) findViewById(R.id.no_1);
        button2 = (TextView) findViewById(R.id.no_2);
        button3 = (TextView) findViewById(R.id.no_3);
        button4 = (TextView) findViewById(R.id.no_4);
        button5 = (TextView) findViewById(R.id.no_5);
        button6 = (TextView) findViewById(R.id.no_6);
        button7 = (TextView) findViewById(R.id.no_7);
        button8 = (TextView) findViewById(R.id.no_8);
        button9 = (TextView) findViewById(R.id.no_9);
        buttonDecimal = (TextView) findViewById(R.id.decimal_btn);
        buttonPlus = (TextView) findViewById(R.id.plus_btn);
        buttonMinus = (TextView) findViewById(R.id.minus_btn);
        buttonMul = (TextView) findViewById(R.id.mul_btn);
        buttonDivide = (TextView) findViewById(R.id.div_btn);
        buttonMod = (TextView) findViewById(R.id.mod_btn);
        buttonAC = (TextView) findViewById(R.id.ac_btn);
        buttonDel = (TextView) findViewById(R.id.del_btn);
        buttonEqual = (TextView) findViewById(R.id.equal_btn);
        equation = (TextView) findViewById(R.id.tv_equation);
        result = (TextView) findViewById(R.id.tv_result);

        equation.setText("");
        result.setText("");

        button00.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                equation.setText(equation.getText() + "00");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "9");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "-");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "/");
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "%");
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + ".");
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText("");
                result.setText("0");
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Equation = equation.getText().toString();
                String remainingEq =  Equation.substring(0,Equation.length()-1);
                equation.setText(remainingEq);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = equation.getText().toString();

                Expression e = new Expression(expression);
                String resultSet = String.valueOf(e.calculate());

                result.setText(resultSet);
            }
        });
    }
}
