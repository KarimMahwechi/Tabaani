package tn.rnu.isetr.tabaani;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> mQuestion = new ArrayList<>();
    RecyclerView recyclerView ;
    RecyclerView.LayoutManager mLayoutManager ;
    RecyclerView.Adapter mAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestion.add("1.Avez vous des problèmes de santé ?");
        mQuestion.add("2.Avez vous des problèmes avec quelq'un de votre famille ?");
        mQuestion.add("3.Avez vous des problèmes de relaxe ?");
        mQuestion.add("4.Avez vous des problèmes de relaxe ?");
        mQuestion.add("5.Avez vous des problèmes de relaxe ?");
        mQuestion.add("6.Avez vous des problèmes de relaxe ?");

        Log.w("MAIN ACTIVTY ",mQuestion.toString());
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MainAdapter(mQuestion);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

    }
}