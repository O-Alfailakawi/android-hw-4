package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Quizzes = findViewById(R.id.QuizzesET);
        final EditText HomeWork = findViewById(R.id.HomeWorkET);
        final EditText MidTerms = findViewById(R.id.MidTermsET);
        final EditText Final = findViewById(R.id.FinalET);
        Button Cal = findViewById(R.id.Calculate);
        Button Reset = findViewById(R.id.Reset);
        final TextView Result = findViewById(R.id.textView6);

        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(Quizzes.getText().toString());
                int b = Integer.parseInt(HomeWork.getText().toString());
                int c = Integer.parseInt(MidTerms.getText().toString());
                int d = Integer.parseInt(Final.getText().toString());
                int z = a + b + c + d;


                if (z > 90) {
                    Result.setText("A");
                    Result.setTextColor(Color.parseColor("#008000"));
                } else if (z > 80) {
                    Result.setText("B");
                    Result.setTextColor(Color.parseColor("#0000FF"));
                } else if (z > 70) {
                    Result.setText("C");
                    Result.setTextColor(Color.parseColor("#FFFF00"));
                } else if (z > 60) {
                    Result.setText("D");
                    Result.setTextColor(Color.parseColor("#FFA500"));
                } else {
                    Result.setText("F");
                    Result.setTextColor(Color.parseColor("#FF0000"));


                }
            }

            ;

        });

            Reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Quizzes.getText().clear();
                    HomeWork.getText().clear();
                    MidTerms.getText().clear();
                    Final.getText().clear();
                    Result.setText("Your Grade is:");
                    Result.setTextColor(Color.parseColor("#000000"));

                }
            });
    }
}




