package com.edwinacubillos.sesion2g2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eNombre, eCorreo;
//    Button bGuardar;
    CheckBox cNadar, cCine, cCorrer;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNombre = findViewById(R.id.eNombre);
        eCorreo = findViewById(R.id.eCorreo);
        cNadar = findViewById(R.id.cNadar);
        cCine = findViewById(R.id.cCine);
        cCorrer = findViewById(R.id.cCorrer);

//        bGuardar = findViewById(R.id.bGuardar);

      /*  bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre = eNombre.getText().toString();
                eCorreo.setText(nombre);
            }
        });*/

    }

    public void onButtonClicked(View view) {
        nombre = eNombre.getText().toString();
        eCorreo.setText(nombre);
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();

        if (id == R.id.rMasculino){
            eCorreo.setText("Masculino");
            //code
        } else {
            eCorreo.setText("Femenino");
            //code
        }
    }

    public void onCheckBoxClicked(View view) {
        int id = view.getId();

        switch (id){
            case R.id.cNadar:
                if (cNadar.isChecked()) {
                    eCorreo.setText("Nadar");
                }
                break;
            case R.id.cCine:
                if (cCine.isChecked()) {
                    eCorreo.setText("Cine");
                }
                break;
            case R.id.cCorrer:
                if (cCorrer.isChecked()) {
                    eCorreo.setText("Correr");
                }
                break;
        }
    }
}




















