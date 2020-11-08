package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Log.d("Question1","La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxième activité.");
        Log.d("Question2","Le bouton Up (Haut) de la barre d'applications n'apparaît plus dans la deuxième activité pour renvoyer l'utilisateur à l'activité parent.");
        Log.d("Question3","new Intent(Context context, Class<?> class)");
        Log.d("Question4","Comme extra d'intention (Intent)");
        Log.d("Question5","Tout ce qui précède.");
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
        Intent myintent = new Intent(this,MainActivity2.class);
        Bundle b = new Bundle();
        b.putString("count",mShowCount.getText().toString());
        myintent.putExtras(b);
        startActivity(myintent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(String.format("%s", mCount));
        }
    }
}