package tn.rnu.isetr.tabaani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AnswerQuestion2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_questions2);
        Button BTNsuivant2 = findViewById(R.id.suivantAnswerQuestion2);


        BTNsuivant2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Merci.class) ;
                startActivity(intent);
            }
        });
    }
}