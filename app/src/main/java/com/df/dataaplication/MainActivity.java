package com.df.dataaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDbHelper db = new MyDbHelper(this);
        Area area = new Area();
         area.setId(3);
         area.setName("Medellin");
         db.insertArea(db.getWritableDatabase(),area);
        // id, nombre, poblacion, latitud, longitud
        ArrayList<Area> areas = db.selectArea(db.getWritableDatabase());
        for ( Area areaSelected : areas) {

            System.out.println("el area "+ areaSelected.getId()+ " es igual a "+ areaSelected.getName());

        }
    
    }
}