package org.example;

import java.time.LocalDateTime;
import java.awt.Color;

public abstract class Alarm {
    protected final String message;
//    protected gives visibility to subclasses and to code in the package
    private LocalDateTime snoozeUntil;
    protected boolean active = false;
//    A class can have multiple constructors
    public Alarm(String message){
        this.message = message;
        stopSnoozing();
    }
    public Alarm(){
//       The Singly Rooted hierarchy above Alarm(parent class) would be Object, hence we should use super(); but this is explicitly called by java
//        Every class has a singular route and has object as its hierarchy. It is the most important class in JAVA
        this.message = "";
//        We can also call other constructors from within a constructor
//        this("Default message value");
    }
    public abstract Color getColor();
    public void snooze(){
        snoozeUntil = LocalDateTime.now().plusMinutes(5);
    }
    public boolean isSnoozing(){
        return snoozeUntil.isAfter(LocalDateTime.now());
    }
    private void stopSnoozing(){
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }

    public void turnOn(){
        active = true;
    }

    public void turnOff(){
        active = false;
    }
    /*
    Getter and Setter methods for snooze time
     */
    public LocalDateTime getSnoozeUntil(){
        return snoozeUntil;
    }
    public void setSnoozeUntil(LocalDateTime snoozeUntil){
        this.snoozeUntil = snoozeUntil;
    }


    public String getReport(){
        return getReport(false);
    }
    public String getReport(boolean uppercase){
        if(active && !isSnoozing()){
            if(uppercase){
                return message.toUpperCase();
            }
            return message;
        }
        else return "";
    }
    public void sendReport(){
        System.out.println(getReport(true));
    }
}
