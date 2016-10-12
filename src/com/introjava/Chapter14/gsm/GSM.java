package com.introjava.Chapter14.gsm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GSM {
    private static GSM nokiaN95 = new GSM("N95", "nokia", 100.00, new Battery(1300), new Display(3.0));

    private String model;
    private String manufacturer;
    private Double price;
    private Battery battery;
    private Display display;
    private List<Call> callHistory = new ArrayList<Call>() {{
        add(new Call(10, new Date(1476208257)));
        add(new Call(20, new Date(1376208257)));
        add(new Call(30, new Date(1276208257)));
    }};

    public GSM() {
    }

    public GSM(String model, String manufacturer, Double price, Battery battery, Display display) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.battery = battery;
        this.display = display;
    }

    public GSM(String model, String manufacturer, Double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void printNokiaN95Info() {
        System.out.println(nokiaN95);
    }


    public static GSM getNokiaN95() {
        return nokiaN95;
    }

    public static void setNokiaN95(GSM nokiaN95) {
        GSM.nokiaN95 = nokiaN95;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public List<Call> getCallHistory() {
        return callHistory;
    }

    public void addCall(Call call) {
        callHistory.add(call);
    }

    public void removeCall(int index) {
        callHistory.remove(index);
    }

    public void deleteCallHistory() {
        callHistory.clear();
    }

    public double calculateTotalCallCost(double pricePerMinute) {
        return callHistory.size() * pricePerMinute;
    }

    public void printInfo() {
        System.out.println("--- info ---");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "GSM{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", battery=" + battery +
                ", display=" + display +
                '}';
    }
}
