package org.example;

import java.time.LocalDateTime;

public class Alarm {
    private final String message;
    private LocalDateTime snoozeUntil;
    private boolean active = false;
//    A class can have multiple constructors
    public Alarm(String message){
        this.message = message;
        stopSnoozing();
    }
    public Alarm(){
        this.message = "";
//        We can also call other constructors from within a constructor
//        this("Default message value");
    }
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
