package com.informaperso.informacionpersonal;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class entrada2 extends AppCompatActivity {

    //declaramos variables entrada
    TextView lblnombre,lblapellido,lblemail,lblfecha;
    EditText txtedades,txtcelu,txtprofesion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada2);
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
        lblemail=findViewById(R.id.lblemail);
        lblfecha=findViewById(R.id.lblfecha);

        txtedades=findViewById(R.id.txtedad);
        txtcelu=findViewById(R.id.txtcel);
        txtprofesion=findViewById(R.id.txttitu);




        //traer mis intenciones de la interfaz(getintent) y los valores(getextras) 1
        Bundle datos = getIntent().getExtras();

        String name=datos.getString( "nombre").toString();
        String lastname=datos.getString( "apellido").toString();
        String correosi=datos.getString("correo").toString();
        int fech=datos.getInt( "fecha");


        lblnombre.setText(name);
        lblapellido.setText(lastname);
        lblemail.setText(correosi);
        lblfecha.setText(""+fech);
        //cuando sea numero se debe agregar dentro de un setText(""+n) n es la variable

    }

    //pasar de pantalla

    public void enviarview2(View view) {
        //capturamos ya los datos a variables
        int edad = 0;
        int cel = 0;
        int fecha = 0;
        String titulo = txtprofesion.getText().toString().trim();
        String name = lblnombre.getText().toString().trim();
        String lastname = lblapellido.getText().toString().trim();
        String correo = lblemail.getText().toString().trim();

        try
        {
            edad = Integer.parseInt(txtedades.getText().toString());
            cel = Integer.parseInt(txtcelu.getText().toString());
            fecha = Integer.parseInt(txtcelu.getText().toString());
        }catch (Exception ex){}

        //pasar una pantalla a otra
        Intent pasarview = new Intent(entrada2.this,entrada3.class);

        //enviar los valores a la otra interfaz
        pasarview.putExtra("edad",edad);
        pasarview.putExtra("cel",cel);
        pasarview.putExtra("titulo",titulo);
        pasarview.putExtra("nombre",name);
        pasarview.putExtra("fecha",fecha);
        pasarview.putExtra("apellido",lastname);
        pasarview.putExtra("email",correo);


        startActivity(pasarview);



    }
}
