package com.introjava.Chapter11;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void sayMuiau() {
        System.out.println(String.format("cat %s says miauuu...", name));
    }
}
