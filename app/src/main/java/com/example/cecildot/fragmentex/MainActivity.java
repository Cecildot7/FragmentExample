package com.example.cecildot.fragmentex;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btnf1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft =fm.beginTransaction();
//                FirstFragment ff = new FirstFragment();
//                ft.add(R.id.container,ff);
//                ft.commit();
                getFragmentManager().beginTransaction().replace(R.id.container, new FirstFragment()).commit();
            }
        });
        Button btn2 = (Button) findViewById(R.id.btnf2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,new SecondFragment()).commit();
            }
        });
    }
}
