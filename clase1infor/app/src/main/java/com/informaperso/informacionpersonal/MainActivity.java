package com.informaperso.informacionpersonal;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.sql.Date;

public class MainActivity extends AppCompatActivity {

    //declaramos variables
    EditText txtnombre,txtapellido,txtcorreo,txtfecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //pasamos los datos ingresados del user a las variables declaradas

        txtnombre=findViewById(R.id.txtnom);
        txtapellido=findViewById(R.id.txtape);
        txtcorreo=findViewById(R.id.txtemails);
        txtfecha=findViewById(R.id.txtfecha);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    //FUNCION DE BOTON
    public void enviarview1(View view) {
    //capturamos ya los datos a variables
        String nombre=txtnombre.getText().toString().trim();
        String apellido=txtapellido.getText().toString().trim();
        String correito=txtcorreo.getText().toString().trim();
        int fecha=0;
    try {
        fecha = Integer.parseInt(txtfecha.getText().toString());
    }catch (Exception ex){

    }

        //pasar una pantalla a otra
        Intent pasarpanta=new Intent(MainActivity.this,entrada2.class);

        //enviar los valores a la otra interfaz
        pasarpanta.putExtra("nombre",nombre);
        pasarpanta.putExtra("apellido",apellido);
        pasarpanta.putExtra("correo",correito);
        pasarpanta.putExtra("fecha",fecha);



        startActivity(pasarpanta);

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
