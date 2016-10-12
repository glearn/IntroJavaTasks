package com.introjava.Chapter14.gsm;


import java.util.Date;

public class GSMCallHistoryTest {
    public static void main(String[] args) {
        GSM gsm = new GSM();

        System.out.println("all");
        System.out.println(gsm.getCallHistory().toString());

        gsm.addCall(new Call(40, new Date(1676208257)));
        gsm.addCall(new Call(20, new Date(1776208257)));

        System.out.println("\nadded calls");
        System.out.println(gsm.getCallHistory().toString());

        System.out.println("total sum: " + gsm.calculateTotalCallCost(0.37));

        System.out.println("removed longest call record");
        gsm.removeCall(3);
        System.out.println(gsm.getCallHistory().toString());

        System.out.println("total sum: " + gsm.calculateTotalCallCost(0.37));

        gsm.deleteCallHistory();
        System.out.println(gsm.getCallHistory());
    }
}
