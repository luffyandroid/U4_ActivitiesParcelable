package com.example.didact.u4_activitiesparcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PersonaActivity extends AppCompatActivity {

    TextView tvNombre, tvEdad, tvSueldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);

        tvNombre = (TextView)findViewById(R.id.pertvNombre);
        tvEdad = (TextView)findViewById(R.id.pertvEdad);
        tvSueldo = (TextView)findViewById(R.id.pertvSueldo);

        Bundle b= getIntent().getExtras();

        if (b!=null){
            Persona p = b.getParcelable(MainActivity.EXTRA_PERSONA);
            tvNombre.setText(p.getNombre());
            tvEdad.setText(p.getEdad()+"");
            tvSueldo.setText(p.getNombre()+"");

        }

    }
}
