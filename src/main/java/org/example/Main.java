package org.example;

public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm("CODE RED: Nuclear reactors are out of control");
        System.out.println("Hello world!");
//        System.out.println(alarm.message);
        alarm.turnOn();
//        System.out.println(alarm.getReport(true));
        alarm.sendReport();
    }
}