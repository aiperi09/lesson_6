package com.geektech.lesson_6;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.lesson_6.databinding.Fragment1Binding;
import com.geektech.lesson_6.databinding.Fragment2Binding;

import java.util.ArrayList;

public class Fragment_2 extends Fragment implements Listenner {
    private Fragment2Binding binding;
    private ArrayList<Model> data = new ArrayList<>();
    private Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = Fragment2Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new Adapter();
        adapter.setListenner(data, this);
        binding.fragmentfirst.setAdapter(adapter);
    }

    private void loadData() {
        data.add(new Model("1", "dtyhdtht", "txxgdtx", "7.21"));
        data.add(new Model("2", "dtyhdtht", "txxgdtx", "7.21"));
        data.add(new Model("3", "dtyhdtht", "txxgdtx", "7.21"));
        data.add(new Model("4", "dtyhdtht", "txxgdtx", "7.21"));
        data.add(new Model("5", "dtyhdtht", "txxgdtx", "7.21"));
        data.add(new Model("6", "dtyhdtht", "txxgdtx", "7.21"));
        data.add(new Model("7", "dtyhdtht", "txxgdtx", "7.21"));
        data.add(new Model("8", "dtyhdtht", "txxgdtx", "7.21"));
        data.add(new Model("9", "dtyhdtht", "txxgdtx", "7.21"));
        data.add(new Model("10", "dtyhdtht", "txxgdtx", "7.21"));

    }

    @Override
    public void onClick(Model model) {
        Intent intent = new Intent(getActivity(), SecondActivity2.class);
        intent.putExtra("key", model.getSong());
        startActivity(intent);
    }
}