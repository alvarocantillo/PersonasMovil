package com.example.android.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
private EditText txtCedula,txtNombre,txtApellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtCedula=findViewById(R.id.txt_cedula);
        txtNombre=findViewById(R.id.txt_nombre);
        txtApellido=findViewById(R.id.txt_apellido);

    }

    public void guardar(View V){
        String ced,nomb,apel;
        ced=txtCedula.getText().toString();
        nomb=txtNombre.getText().toString();
        apel=txtApellido.getText().toString();

        Persona p=new Persona(ced,nomb,apel);
        p.guardar();
        Toast.makeText(this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();
    }

    public void limpiar(View V){
    borrar();
    }

    public void borrar(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
    }
}
