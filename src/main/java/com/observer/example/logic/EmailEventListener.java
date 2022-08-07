package com.observer.example.logic;

public class EmailEventListener implements EventListener{
    @Override
    public void update(Event event,String updatedFileName) {
        System.out.println("Email Notification : Event "+ event+ " on file "+ updatedFileName);
    }
}
