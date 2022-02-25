package com.example.guia3_android_java;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.guia3_android_java.databinding.FragmentFragmento1Binding;
import com.example.guia3_android_java.databinding.FragmentFragmento2Binding;


public class Fragmento2 extends Fragment {
    private FragmentFragmento2Binding binding;
    private TextView txt1, txt2, txt3, txt4, txt5, txt6;


    public Fragmento2() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("datos", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String nombre = result.getString("nombre");
                txt1.setText("Nombre: " + nombre);
                String salario = result.getString("salario");
                txt2.setText("Salario: $" + salario);
                String isss = result.getString("isss");
                txt3.setText("ISSS: $" + isss);
                String afp = result.getString("afp");
                txt4.setText("AFP: $" + afp);
                String renta = result.getString("renta");
                txt5.setText("Renta: $" + renta);
                String sueldoneto = result.getString("sueldoneto");
                txt6.setText("Sueldo Neto: $" + sueldoneto);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFragmento2Binding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txt1 = binding.txt1;
        txt2 = binding.txt2;
        txt3 = binding.txt3;
        txt4 = binding.txt4;
        txt5 = binding.txt5;
        txt6 = binding.txt6;
    }
}