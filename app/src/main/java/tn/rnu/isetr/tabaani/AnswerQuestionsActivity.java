package tn.rnu.isetr.tabaani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AnswerQuestionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_questions);
        Button BTNsuivant = findViewById(R.id.suivantAnswerQuestion);


        BTNsuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ANswerQuestion2.class) ;
                startActivity(intent);
            }
        });



    }
}
