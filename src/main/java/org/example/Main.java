package org.example;

public class Main {
    public static void main(String[] args) {
        Alarm alarm = new PriorityAlarm("CODE RED: Reactor temperature is out of control",1);
        System.out.println("Hello world!");
//        System.out.println(alarm.message);
        alarm.turnOn();
//        System.out.println(alarm.getReport(true));
        alarm.sendReport();
    }
}