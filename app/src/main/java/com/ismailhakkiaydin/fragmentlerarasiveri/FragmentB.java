package com.ismailhakkiaydin.fragmentlerarasiveri;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    TextView sonuc;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_b, container, false);
        sonuc= (TextView) v.findViewById(R.id.tvSonucFragment);
        return v;
    }


    public void sayilariTopla(int sayi1, int sayi2) {

        int toplam=sayi1+sayi2;
        sonuc.setText("TOPLAM = "+ toplam);

    }
}