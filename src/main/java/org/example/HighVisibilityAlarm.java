package org.example;

public class HighVisibilityAlarm extends Alarm{
    public HighVisibilityAlarm(String message){
        super(message);
    }
//    @override annotation is used to indicate that a method is an overriding method of another class
    @Override
    public String getReport(boolean uppercase){
       String report = super.getReport(uppercase);
//Calling getReport() from superclass/parent Alarm
       if(report.isEmpty()){
           return report;
       }
       else
           return report + "!";
    }
    public static void main(String[] args){
        HighVisibilityAlarm alarm = new HighVisibilityAlarm("jhajdashjdjgasd");
        alarm.turnOn();
        System.out.println(alarm.getReport(true));
    }
}
