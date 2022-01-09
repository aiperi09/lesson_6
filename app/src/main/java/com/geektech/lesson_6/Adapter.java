package com.geektech.lesson_6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.lesson_6.databinding.ItemPlaylistBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
private ArrayList<Model> data = new ArrayList<>();
public static Listenner listenner;

    public void setListenner(ArrayList<Model> list, Listenner listenner){
        this.listenner = listenner;
        this.data = new ArrayList<>();
        this.data.addAll(list);
        notifyDataSetChanged();

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPlaylistBinding binding =  ItemPlaylistBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
       private final ItemPlaylistBinding viewBinding;

        public ViewHolder(@NonNull ItemPlaylistBinding binding) {
            super(binding.getRoot());
            viewBinding = binding;
        }

        public void onBind(Model model) {
            viewBinding.name1.setText(model.getAuthor());
            viewBinding.name2.setText(model.getSong());
            viewBinding.time.setText(model.getTime());
            viewBinding.number.setText(model.getNumber());
            itemView.setOnClickListener(v -> {
                listenner.onClick(model);
            });

        }
    }
}
