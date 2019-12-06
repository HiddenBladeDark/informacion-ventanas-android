package com.informaperso.informacionpersonal;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class entrada3 extends AppCompatActivity {

    //declaramos variables entrada
    TextView lblnombre,lblapellido,lblemailes,lblfechas,lbledades,lblcelular,lblprofesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //pasamos los datos ingresados del user a las variables declaradas
        lblnombre=findViewById(R.id.lblnom);
        lblapellido=findViewById(R.id.lblape);
        lblemailes=findViewById(R.id.lblemail);
        lblfechas=findViewById(R.id.lblfecha);
        lbledades=findViewById(R.id.lbledad);
        lblcelular=findViewById(R.id.lbltel);
        lblprofesion=findViewById(R.id.lblprofe);


        //traer mis intenciones de la interfaz(getintent) y los valores(getextras) 1
        Bundle datos = getIntent().getExtras();

        String name = datos.getString("nombre").toString();
        String apellido = datos.getString("apellido").toString();
        String correito = datos.getString("email").toString();
        int fecha = datos.getInt("fecha");
        int edad = datos.getInt("edad");
        String profe = datos.get("titulo").toString();
        int celu = datos.getInt("cel");

        lblnombre.setText(name);
        lblapellido.setText(apellido);
        lblemailes.setText(correito);
        lblfechas.setText(""+fecha);
        lbledades.setText(""+edad);
        lblprofesion.setText(""+profe);
        lblcelular.setText(""+celu);
        


    }

}
