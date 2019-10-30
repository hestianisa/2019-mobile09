package com.example.tugas3.models;

import android.graphics.drawable.Drawable;

public class MinionKuning {
    public String minionName;
    public Drawable image;

    public MinionKuning(Drawable image, String minionName)
    {
        this.minionName = minionName;
        this.image = image;
    }


    public String getMinionName() {
        return minionName;
    }

    public void setMinionName(String minionName) {
        this.minionName = minionName;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
