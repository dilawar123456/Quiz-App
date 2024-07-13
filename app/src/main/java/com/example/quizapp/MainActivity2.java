package com.example.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
TextView qs;
TextView scoreprint;
Button btntrue;
Button btnfalse;
    boolean check;
    int score;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        qs=findViewById(R.id.txtQs);
        btntrue=findViewById(R.id.btntrue);
        btnfalse=findViewById(R.id.btnfalse);
        scoreprint=findViewById(R.id.txtscore);
        String[] Questions={"The main function in a C++ program can return any integer value",
        "In C++, the cin object is used to read input from the standard input (keyboard)",
        "The #include directive in C++ is used to include standard or user-defined header files",
        "In C++, a class and a struct are functionally different",
        "In C++, the delete operator is used to deallocate memory that was allocated with new ",
        "In C++, the && operator is used to perform a bitwise AND operation ",
        "In C++, all members of a struct are private by default",
        "In C++, all members of a class are public by default",
        "In C++, function overloading allows multiple functions to have the same name if their parameter lists are different",
        "In C++, it is possible to catch exceptions by value, by reference, and by pointer",

        };
        boolean[] answers={true,true,true,false,true,false,false,false,true,true};
         count=0;
         score=0;

        qs.setText(Questions[count]);
        btnfalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count>=10)
                {
                    return;
                }
                check=false;
                if (check==answers[count])
                {
                    score++;
                    Toast.makeText(MainActivity2.this, "Correct!!👌👌", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "Wrong!!😒😒", Toast.LENGTH_SHORT).show();
                }
                count++;
                if(count==10)
                {
                    qs.setText("");
                    scoreprint.setText("Score : "+score+" /10");

                }
                else {
                    qs.setText(Questions[count]);
                }
            }
        });
        btntrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count>=10)
                {
                    return;
                }
               check=true;
               if (check==answers[count])
               {
                   score++;
                   Toast.makeText(MainActivity2.this, "Correct!!👌👌", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(MainActivity2.this, "Wrong!!😒😒", Toast.LENGTH_SHORT).show();
               }
               count++;
               if(count==10)
               {
                   qs.setText("");
                   scoreprint.setText("Score : "+score+" /10");

               }
               else {
                   qs.setText(Questions[count]);
               }

            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
}