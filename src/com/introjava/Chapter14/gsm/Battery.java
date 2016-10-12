package com.introjava.Chapter14.gsm;

public class Battery {
    private String model;
    private Integer mah;

    public Battery(String model, Integer mah) {
        this.model = model;
        this.mah = mah;
    }

    public Battery(Integer mah) {
        this.mah = mah;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMah() {
        return mah;
    }

    public void setMah(Integer mah) {
        this.mah = mah;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "model='" + model + '\'' +
                ", mah=" + mah +
                '}';
    }
}
