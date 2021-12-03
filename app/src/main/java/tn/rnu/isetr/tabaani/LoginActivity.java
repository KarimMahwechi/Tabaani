package tn.rnu.isetr.tabaani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button BTN = findViewById(R.id.cirLoginButton);
        EditText mail = findViewById(R.id.editTextEmail);
        EditText pass = findViewById(R.id.editTextPassword);
        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mail.getText().toString().equalsIgnoreCase("user") && pass.getText().toString().equalsIgnoreCase("user")) {
                    startActivity(new Intent(getApplicationContext(), AnswerQuestionsActivity.class));
                    finish();
                }
                else if (!(mail.getText().toString().equalsIgnoreCase("user")) || !(pass.getText().toString().equalsIgnoreCase("user")))
                {
                    Toast.makeText(getApplicationContext(), "Connexion impossible ! Il faut verifier votre adresse mail ou mot de passe. ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void onLogClick(View view){
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }
}