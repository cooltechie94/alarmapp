package org.example;

public class Alarm {
    String message;
    boolean active = false;
    Alarm(String message){
        this.message = message;
    }
    void turnOn(){
        active = true;
    }
}
