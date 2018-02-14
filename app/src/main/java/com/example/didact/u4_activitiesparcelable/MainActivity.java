package com.example.didact.u4_activitiesparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Creamos una variable final para guardar la etiqueta
    static final String EXTRA_PERSONA = "PERSONA";

    EditText etNombre, etEdad, etSueldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.mainEtNombre);
        etEdad = (EditText)findViewById(R.id.mainEtEdad);
        etSueldo = (EditText)findViewById(R.id.mainEtSueldo);

    }

    public void mainClickAceptar(View view){

        String nombre = etNombre.getText().toString();
        String cajaedad = etEdad.getText().toString();
        String cajasueldo = etSueldo.getText().toString();

        if (nombre.equals("") || cajaedad.equals("") || cajaedad.equals("")){

            Toast.makeText(getApplicationContext(),"Debes rellenar todos los campos",
                    Toast.LENGTH_LONG).show();

        }else{

            int edad = Integer.parseInt(cajaedad);
            double sueldo = Double.parseDouble(cajasueldo);

            //Creamos el onjeto de tipo persona con lso valores recogidos del formulario
            Persona persona = new Persona(nombre, edad, sueldo);

            //Creamos el objeto Intent para enviar nuestra persona a otra activity
            Intent i=new Intent(getApplicationContext(),PersonaActivity.class);

            //Añadimos el objeto persona que queremos enviar al activity de destino
            i.putExtra(EXTRA_PERSONA,persona);

            //Iniciamos el nuevo activity
            startActivity(i);





        }

    }

}
