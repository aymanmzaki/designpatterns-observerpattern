package com.observer.example.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<Event, List<EventListener>> listeners;

    public EventManager() {
        listeners = new HashMap<Event, List<EventListener>>();
    }

    public void subscribe(Event eventType, EventListener listener) {
        if (listeners.get(eventType) == null) {
            ArrayList<EventListener> eventListeners = new ArrayList<EventListener>();
            eventListeners.add(listener);
            listeners.put(eventType, eventListeners);
        } else {
            listeners.get(eventType).add(listener);
        }
    }

    public void unsubscribe(Event eventType, EventListener listener) {
        listeners.remove(eventType);
    }

    public void notify(Event eventType, String data) {
        listeners.get(eventType).stream().parallel().forEach(listener -> {
            listener.update(eventType,data);
        });
    }
}

