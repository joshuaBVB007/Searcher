package com.example.searcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //capturo del xml el objeto jonathan que es object AutoCompleteTextView
        AutoCompleteTextView auto=findViewById(R.id.jonathan);
        /*me creo una lista de tipo string porque recupero con el metodo getResources().getStringArray(R.array.Paises);
        el array desde mis recursos string*/
        String [] lista_paises=getResources().getStringArray(R.array.Paises);


        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,lista_paises);
        auto.setAdapter(adapter);

    }
}