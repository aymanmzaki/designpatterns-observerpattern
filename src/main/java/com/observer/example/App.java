package com.observer.example;

import com.observer.example.logic.EmailEventListener;
import com.observer.example.logic.Event;
import com.observer.example.logic.EventManager;

public class App {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        eventManager.subscribe(Event.OPEN,new EmailEventListener());
        eventManager.subscribe(Event.EDIT, new EmailEventListener());

        Editor editor= new Editor(eventManager);

        editor.openFile("Hello");
        editor.edit("Hello");
    }
}
