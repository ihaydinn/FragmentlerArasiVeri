package com.ismailhakkiaydin.fragmentlerarasiveri;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyListener {

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager=getFragmentManager();

        addFragmentA();
        addFragmentB();

    }



    private void addFragmentA() {

        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.containerA, fragmentA, "fragA");
        transaction.commit();

    }

    private void addFragmentB() {

        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.containerB, fragmentB, "fragB");
        transaction.commit();
    }

    @Override
    public void sayilariTopla(int sayi1, int sayi2) {

        FragmentB fragmentb= (FragmentB) manager.findFragmentByTag("fragB");
        fragmentb.sayilariTopla(sayi1, sayi2);

    }
}