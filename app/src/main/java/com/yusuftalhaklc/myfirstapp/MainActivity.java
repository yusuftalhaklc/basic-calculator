package com.yusuftalhaklc.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }
    public void operations(String operationName,View view){
        try {
            if(!number1Text.getText().toString().matches("") || !number2Text.getText().toString().matches("")) {
                int num1 = Integer.parseInt(number1Text.getText().toString());
                int num2 = Integer.parseInt(number2Text.getText().toString());
                int result;

                switch (operationName) {
                    case "sum":
                        result = num1 + num2;
                        resultText.setText("Result : " + result);
                        break;

                    case "deduct":
                        result = num1 - num2;
                        resultText.setText("Result : " + result);
                        break;

                    case "multiply":
                        result = num1 * num2;
                        resultText.setText("Result : " + result);
                        break;

                    case "divide":
                        result = num1 / num2;
                        resultText.setText("Result : " + result);
                        break;
                }
            }
            else{
                resultText.setText("Error!");
            }
        }
        catch (ArithmeticException ex) {
            resultText.setText("Divide by zero");
        }

    }

    public void sum(View view){
        operations("sum", view);
    }

    public void deduct(View view){
        operations("deduct", view);
    }

    public void multiply(View view){
        operations("multiply", view);
    }

    public void divide(View view){
        operations("divide", view);
    }

}
