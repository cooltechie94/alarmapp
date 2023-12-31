package org.example;
import java.awt.Color;
public class PriorityAlarm extends Alarm{
    private final int priority;
    public PriorityAlarm(String message, int priority){
        super(message);
//        calling super() must be the first thing you do in a sub-class constructor
        this.priority = priority;
    }
    @Override
    public Color getColor(){
        return Color.RED;
    }
    public int getPriority(){
        return priority;
    }
    public static void main(String[] args){
        PriorityAlarm alarm = new PriorityAlarm("Testing 1 2 3", 42 );
        alarm.getPriority();
    }
}
