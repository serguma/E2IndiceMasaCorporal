package com.gumadev.e2indicemasacorporal;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MuestraResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle){

        super.onCreate(bundle);
        setContentView(R.layout.activity_muestra_resultado);

        //Obtengo los valores para realizar el cálculo
        Intent intent = getIntent();
        float peso = intent.getFloatExtra("peso",0);
        float altura = intent.getFloatExtra("altura",0);

        TextView elmensaje = (TextView) findViewById(R.id.elmensaje);
        String resultado = Utils.calculaIMC(peso,altura,this);
        elmensaje.setText(resultado);

        //para este botón no he creado una clase, lo he llamado directamente aquí. Para volver a la actividad principal
        Button boton = (Button) findViewById(R.id.volver);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(getClass().getCanonicalName(), "Se ha pulsado el botón volver");
                Intent intent = new Intent(MuestraResultado.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

}
