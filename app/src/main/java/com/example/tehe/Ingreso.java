package com.example.tehe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class Ingreso extends AppCompatActivity {

    TextView mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);

        TextView mv = findViewById(R.id.textView);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int scw= size.x;

        animeTranslationLeftToRight(mv,scw);
    }

    public void animeTranslationLeftToRight(View view,int scsize){
        int d = 3000;
        int teleftx = scsize * -1;
        int terightx = scsize;
        view.setTranslationX(teleftx);
        //view.animate().translationXBy(teleftx).translationX(terightx).setDuration(d).withEndAction(()->animeTranslationLeftToRight(view));
    }


}
