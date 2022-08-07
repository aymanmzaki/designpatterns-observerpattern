package com.observer.example;

import com.observer.example.logic.Event;
import com.observer.example.logic.EventManager;

public class Editor {

    public EventManager eventManager;

    public Editor(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void openFile(String file) {
        System.out.println("Opening File ");
        eventManager.notify(Event.OPEN,  file );
    }

    public void edit(String file) {
        System.out.println("Editing File ");
        eventManager.notify(Event.EDIT, file);
    }

}
