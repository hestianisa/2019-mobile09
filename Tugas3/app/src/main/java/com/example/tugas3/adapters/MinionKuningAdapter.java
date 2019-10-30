package com.example.tugas3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas3.R;
import com.example.tugas3.models.MinionKuning;

import java.util.ArrayList;
import java.util.List;

public class MinionKuningAdapter extends RecyclerView.Adapter<MinionKuningAdapter.MyViewHolder> {
    List<MinionKuning> kuningList = new ArrayList<>();


    public MinionKuningAdapter(List<MinionKuning> kuningList){
        this.kuningList = kuningList;
    }


    @NonNull
    @Override
    public MinionKuningAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View vh = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_minion_kuning,viewGroup, false);


        MyViewHolder viewHolder = new MyViewHolder((vh));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MinionKuningAdapter.MyViewHolder holder, int position) {
        MinionKuning item  = kuningList.get(position);
        holder.txtMinion.setText(item.getMinionName());
        holder.imageMinion.setImageDrawable(item.getImage());

    }

    @Override
    public int getItemCount() {
        return kuningList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageMinion;
        public TextView txtMinion;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageMinion = itemView.findViewById(R.id.image_minion);
            txtMinion = itemView.findViewById(R.id.txt_minion);

        }
    }
}