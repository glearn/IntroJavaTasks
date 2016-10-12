package com.introjava.Chapter14.gsm;

public class GSMTest {
    public static void main(String[] args) {
        GSM[] phones = new GSM[]{
                new GSM("modelA", "manufacturer1", 199.39, new Battery(4400), new Display(5.5)),
                new GSM("modelB", "manufacturer2", 299.39, new Battery(4400), new Display(5.5))
        };

        for (GSM phone : phones) {
            phone.printInfo();
        }

        GSM.getNokiaN95().printInfo();
    }
}
