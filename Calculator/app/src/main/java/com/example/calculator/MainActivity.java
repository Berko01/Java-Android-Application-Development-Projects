package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText ve TextView öğelerini initalize et
        number1Text = findViewById(R.id.editTextNum1);
        number2Text = findViewById(R.id.editTextNum2);
        resultText = findViewById(R.id.textViewResult);
    }

    public void sum(View view) {
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 + number2;

        // Sonucu metin olarak ayarla
        resultText.setText(String.valueOf(result));
    }

    public void deduct(View view) {
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 - number2;

        // Sonucu metin olarak ayarla
        resultText.setText(String.valueOf(result));
    }

    public void multiplication(View view) {


        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Numara gir!");
        }
        else {

            // Sonucu metin olarak ayarla
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;
            resultText.setText(String.valueOf(result));
        }

    }

    public void division(View view) {
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());

        int result = number1 / number2;

        // Sonucu metin olarak ayarla
        resultText.setText(String.valueOf(result));
    }
}
