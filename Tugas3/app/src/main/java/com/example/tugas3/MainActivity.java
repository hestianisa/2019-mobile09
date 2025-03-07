package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas3.adapters.MinionKuningAdapter;
import com.example.tugas3.models.MinionKuning;

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
        MinionKuning minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion), "Minion");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion1), "Minion 1");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion2), "Minion 2");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion3), "Minion 3");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion4), "Minion 4");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion5), "Minion 5");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion6), "Minion 6");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion7), "Minion 7");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion8), "Minion 8");
        kuningList.add(minion);
        minion = new MinionKuning(this.getResources().getDrawable(R.drawable.minion9), "Minion 9");
        kuningList.add(minion);
        MinionKuningAdapter minionKuningAdapter = new MinionKuningAdapter(kuningList);
        rvMinion.setAdapter(minionKuningAdapter);
        rvMinion.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
