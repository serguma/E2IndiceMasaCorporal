package com.gumadev.e2indicemasacorporal;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by sergu on 07/01/2017.
 */

public class Utils {

    public Context ct;
    public Utils (Context context){
        this.ct = context;
    }

    public static String calculaIMC(float peso, float altura, Context ct){
        String mensaje;

        Activity activity = (Activity) ct;

        if((altura > 0.0 && peso > 0.0)) {
            altura = (altura / 100);
            float IMC = peso / (altura * altura);

            if (IMC < 16) {
                mensaje = activity.getResources().getString(R.string.tuimc) + IMC + " \n " + activity.getResources().getString(R.string.desnutrido);
            } else if (IMC <= 18) {
                mensaje = activity.getResources().getString(R.string.tuimc) + IMC + " \n " + activity.getResources().getString(R.string.bajopeso);
            } else if (IMC < 25) {
                mensaje = activity.getResources().getString(R.string.tuimc) + IMC + " \n " + activity.getResources().getString(R.string.normal);
            } else if (IMC < 31) {
                mensaje = activity.getResources().getString(R.string.tuimc) + IMC + " \n " + activity.getResources().getString(R.string.sobrepeso);
            } else {
                mensaje = activity.getResources().getString(R.string.tuimc) + IMC + " \n " + activity.getResources().getString(R.string.obesidad);
            }
        }else{
            mensaje = activity.getResources().getString(R.string.error);
        }

        return mensaje;
    }

}
