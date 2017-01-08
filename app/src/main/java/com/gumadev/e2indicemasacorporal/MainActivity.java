package com.gumadev.e2indicemasacorporal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle bundle) {

        Log.v(getClass().getCanonicalName(), "Estamos en el Oncreate");

        super.onCreate(bundle);

        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.calcular);
        EscuchaBoton escuchaBoton = new EscuchaBoton(this);
        boton.setOnClickListener(escuchaBoton);

    }
}
