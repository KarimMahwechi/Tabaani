package tn.rnu.isetr.tabaani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    RadioButton RB_EtatCivil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        Button BTNTerminer = findViewById(R.id.cirTerminerButton);
        // Details of the account
        // ------------------  The EditText   -------------------------
        EditText editTextPseudo = findViewById(R.id.editTextAccount_Nom);
        EditText editTextAge = findViewById(R.id.editTextAccount_Age);
        EditText editTextNbEnfants = findViewById(R.id.editTextAccount_NbEnfants);
        EditText editTextProffesion = findViewById(R.id.editTextAccount_Proffesion);


        // ------------------  The RadioGroup  ------------------------
        // Sexe
        RadioGroup radioGroupSexe = findViewById(R.id.groupe_sexe);
        // Civil status
        RadioGroup radioGroupEtatCivil = findViewById(R.id.groupe_etatCivil);
        // status
        RadioGroup radioGroupStatu = findViewById(R.id.groupe_Statu);
        // Brothers and Sisters
        RadioGroup radioGroupBroSis = findViewById(R.id.groupe_BroSis);
        // Availability during the week
        RadioGroup radioGroupDispoSemaine = findViewById(R.id.groupe_DispoSemaine);
        // Availability in the weekend
        RadioGroup radioGroupDispoWeekend = findViewById(R.id.groupe_DispoWeekend);
        // Went out choice
        RadioGroup radioGroupWentOut = findViewById(R.id.groupe_Sortir);
        // Reading Passionate
        RadioGroup radioGroupLecture = findViewById(R.id.groupe_ReadingPassionate);
        // Time of playing
        RadioGroup radioGroupDureeJeux = findViewById(R.id.groupe_PlayingTime);
        // Shopping percentage
        RadioGroup radioGroupShopping = findViewById(R.id.groupe_Shopping);

        // ------------------  The CheckBox  ------------------------

        // *************       FAVORITE FILM    **********************
        // Action film
        CheckBox checkBoxFilmAction = findViewById(R.id.checkbox_Action);
        // Comedy film
        CheckBox checkBoxFilmComedie = findViewById(R.id.checkbox_Comédie);
        // Drama film
        CheckBox checkBoxFilmDrama = findViewById(R.id.checkbox_Drama);
        // Adventure film
        CheckBox checkBoxFilmAventure= findViewById(R.id.checkbox_Aventure);
        // Scary film
        CheckBox checkBoxFilmHorreur = findViewById(R.id.checkbox_Horreur);

        // *************       FAVORITE MUSIC    **********************
        // Music Tunisienne
        CheckBox checkBoxMusiqueTuni = findViewById(R.id.checkbox_MusicTunisienne);
        // Music Occidentale
        CheckBox checkBoxMusiqueOccidentale = findViewById(R.id.checkbox_MusicOccidentale);
        // Music Orientale
        CheckBox checkBoxMusiqueOrientale = findViewById(R.id.checkbox_MusicOrientale);
        // Music Instrumentale
        CheckBox checkBoxMusiqueInstrumentale = findViewById(R.id.checkbox_MusicInstrumentale);
        // Music Latin
        CheckBox checkBoxMusiqueLatin = findViewById(R.id.checkbox_MusicLatin);

        // *************       FAVORITE INTELLECTUAL GAMES    **********************
        // Echecs
        CheckBox checkBoxJeuxEchecs = findViewById(R.id.checkbox_GameIntellecEchecs);
        // Cube
        CheckBox checkBoxJeuxCube = findViewById(R.id.checkbox_GameIntellecRubik);
        // Scrabble
        CheckBox checkBoxJeuxScrabble= findViewById(R.id.checkbox_GameIntellecScrable);


        // *************       FAVORITE VIDEOS GAMES    **********************
        // NBA
        CheckBox checkBoxJeuxVideoNBA = findViewById(R.id.checkbox_VideoGameNBA);
        // FIFA
        CheckBox checkBoxJeuxVideoFIFA = findViewById(R.id.checkbox_VideoGameFifa);
        // VALORANT
        CheckBox checkBoxJeuxVideoVALORANT= findViewById(R.id.checkbox_VideoGameValorant);

        // *************       FAVORITE NATUREL PLACE    **********************
        // Sea place
        CheckBox checkBoxPlaceMer = findViewById(R.id.checkbox_FavoritePlacesSea);
        // Mountain place
        CheckBox checkBoxPlaceMontagne = findViewById(R.id.checkbox_FavoritePlacesMountain);
        // Desert place
        CheckBox checkBoxPlaceDésert= findViewById(R.id.checkbox_FavoritePlacesDesert);
        // Forest place
        CheckBox checkBoxPlaceForét= findViewById(R.id.checkbox_FavoritePlacesForest);

        // *************       FAVORITE SPORT ACTIVITY   **********************
        // Swimming Activity
        CheckBox checkBoxActivitySwimming = findViewById(R.id.checkbox_FavoriteSportSwimming);
        // Golf Activity
        CheckBox checkBoxActivityGolf = findViewById(R.id.checkbox_FavoriteSportGolf);
        // Camping Activity
        CheckBox checkBoxActivityCamping = findViewById(R.id.checkbox_FavoriteSportCamping);
        // Alpinisme Activity
        CheckBox checkBoxActivityMountaineering = findViewById(R.id.checkbox_FavoriteSportMountaineering);



        int selectedRadioGroupEtatCivil = radioGroupEtatCivil.getCheckedRadioButtonId();
        //RB_EtatCivil = findViewById(selectedRadioGroupEtatCivil);
        if (selectedRadioGroupEtatCivil==0){
            editTextNbEnfants.setEnabled(false);
        }
        int selectedRadioGroupProffesion = radioGroupStatu.getCheckedRadioButtonId();
        if (selectedRadioGroupEtatCivil == 0){
            editTextProffesion.setEnabled(false);
        }

        BTNTerminer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class) ;
                startActivity(intent);
            }
        });
    }
}
