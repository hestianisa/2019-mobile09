package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas1.adapters.MinionKuningAdapter;
import com.example.tugas1.models.MinionKuning;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvMinion;
    //instansiasi list minion
    List<MinionKuning> kuningList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMinion = findViewById(R.id.rvMinion);
        MinionKuning minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion),"Minion");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion), "Minion");
        kuningList.add(minion);
        MinionKuningAdapter minionKuningAdapter= new MinionKuningAdapter(kuningList);
        rvMinion.setAdapter(minionKuningAdapter);
        rvMinion.setLayoutManager(new LinearLayoutManager(this));

    }
}
