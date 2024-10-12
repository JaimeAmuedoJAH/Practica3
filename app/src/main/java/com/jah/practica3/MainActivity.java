package com.jah.practica3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    RadioGroup rgRespuestas;
    RadioButton rbOpcionA, rbOpcionB, rbOpcionC, rbOpcionD;
    Spinner spPreguntas;
    TextView lblMostrarPregunta;
    ArrayAdapter<CharSequence> adaptador;
    String str, a, b, c, d;
    int nota;
    int posicion;
    char[] respuestas ;
    char[] respCorrectas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btnEnviar);
        rgRespuestas = findViewById(R.id.rgRespuestas);
        rbOpcionA = findViewById(R.id.rbOpcionA);
        rbOpcionB = findViewById(R.id.rbOpcionB);
        rbOpcionC = findViewById(R.id.rbOpcionC);
        rbOpcionD = findViewById(R.id.rbOpcionD);
        spPreguntas = findViewById(R.id.spPreguntas);
        lblMostrarPregunta = findViewById(R.id.lblMostrarPregunta);

        respuestas = new char[10];
        respCorrectas = new char[]{'c', 'b', 'd', 'b', 'c', 'a', 'a', 'b', 'a', 'c'};
        nota = 10;
        posicion = 0;

        btnEnviar.setOnClickListener(view -> notaTest(respuestas, respCorrectas));

        adaptador = ArrayAdapter.createFromResource(this, R.array.preguntas, android.R.layout.simple_dropdown_item_1line);
        spPreguntas.setAdapter(adaptador);
        str = spPreguntas.getSelectedItem() + "";
        lblMostrarPregunta.setText(str);

        spPreguntas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int ind, long l) {
                mostrarPregunta();
                mostrarRespuestas(ind);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        rgRespuestas.setOnCheckedChangeListener((radioGroup, i) -> responder(posicion));
    }

    private void responder(int posicion) {
        char respuesta = ' ';

        if(posicion == 0){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }else if(posicion == 1){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }else if(posicion == 2){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }else if(posicion == 3){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }else if(posicion == 4){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }else if(posicion == 5){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }else if(posicion == 6){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }else if(posicion == 7){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }else if(posicion == 8){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }else if(posicion == 9){
            if(rbOpcionA.isChecked()){
                respuesta = 'a';
            }else if(rbOpcionB.isChecked()){
                respuesta = 'b';
            }else if(rbOpcionC.isChecked()){
                respuesta = 'c';
            }else{
                respuesta = 'd';
            }

        }
        respuestas[posicion] = respuesta;
        Log.i("DAM", posicion + " " + respuestas[posicion]);
    }

    private void mostrarRespuestas(int indice) {
        String a, b, c, d;
        a = "";
        b = "";
        c = "";
        d = "";

        if(indice == 0){
            a = getString(R.string.Respuesta_primera_A);
            b = getString(R.string.Respuesta_primera_B);
            c = getString(R.string.Respuesta_primera_C);
            d = getString(R.string.Respuesta_primera_D);
        }else if(indice == 1){
            a = getString(R.string.Respuesta_segunda_A);
            b = getString(R.string.Respuesta_segunda_B);
            c = getString(R.string.Respuesta_segunda_C);
            d = getString(R.string.Respuesta_segunda_D);
        }else if(indice == 2){
            a = getString(R.string.Respuesta_tercera_A);
            b = getString(R.string.Respuesta_tercera_B);
            c = getString(R.string.Respuesta_tercera_C);
            d = getString(R.string.Respuesta_tercera_D);
        }else if(indice == 3){
            a = getString(R.string.Respuesta_cuarta_A);
            b = getString(R.string.Respuesta_cuarta_B);
            c = getString(R.string.Respuesta_cuarta_C);
            d = getString(R.string.Respuesta_cuarta_D);
        }else if(indice == 4){
            a = getString(R.string.Respuesta_quinta_A);
            b = getString(R.string.Respuesta_quinta_B);
            c = getString(R.string.Respuesta_quinta_C);
            d = getString(R.string.Respuesta_quinta_D);
        }else if(indice == 5){
            a = getString(R.string.Respuesta_sexta_A);
            b = getString(R.string.Respuesta_sexta_B);
            c = getString(R.string.Respuesta_sexta_C);
            d = getString(R.string.Respuesta_sexta_D);
        }else if(indice == 6){
            a = getString(R.string.Respuesta_septima_A);
            b = getString(R.string.Respuesta_septima_B);
            c = getString(R.string.Respuesta_septima_C);
            d = getString(R.string.Respuesta_septima_D);
        }else if(indice == 7){
            a = getString(R.string.Respuesta_octava_A);
            b = getString(R.string.Respuesta_octava_B);
            c = getString(R.string.Respuesta_octava_C);
            d = getString(R.string.Respuesta_octava_D);
        }else if(indice == 8){
            a = getString(R.string.Respuesta_novena_A);
            b = getString(R.string.Respuesta_novena_B);
            c = getString(R.string.Respuesta_novena_C);
            d = getString(R.string.Respuesta_novena_D);
        }else if(indice == 9){
            a = getString(R.string.Respuesta_decima_A);
            b = getString(R.string.Respuesta_decima_B);
            c = getString(R.string.Respuesta_decima_C);
            d = getString(R.string.Respuesta_decima_D);
        }
        posicion = indice;
        rbOpcionA.setText(a);
        rbOpcionB.setText(b);
        rbOpcionC.setText(c);
        rbOpcionD.setText(d);
    }

    private void mostrarPregunta() {
        str = spPreguntas.getSelectedItem() + "";
        lblMostrarPregunta.setText(str);
    }

    private void notaTest(char[] respuestas, char[] respCorrectas) {

        for(int i = 0;i < respuestas.length;i++){

            if(respuestas[i] != respCorrectas[i]){
                nota -= 1;
            }
            Log.i("array", "" + respuestas[i]);
        }

        String str = "Tu nota del tipo test es: " + nota;
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }
}