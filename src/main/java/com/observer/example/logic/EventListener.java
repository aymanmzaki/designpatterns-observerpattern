package com.observer.example.logic;

public interface EventListener {
    public void update(Event event, String updatedFileName);
}
