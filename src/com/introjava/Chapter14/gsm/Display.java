package com.introjava.Chapter14.gsm;

public class Display {
    private Double inches;
    private Integer colors;

    public Display(Double inches, Integer colors) {
        this.inches = inches;
        this.colors = colors;
    }

    public Display(Double inches) {
        this.inches = inches;
    }

    public Double getInches() {
        return inches;
    }

    public void setInches(Double inches) {
        this.inches = inches;
    }

    public Integer getColors() {
        return colors;
    }

    public void setColors(Integer colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Display{" +
                "inches=" + inches +
                ", colors=" + colors +
                '}';
    }
}
