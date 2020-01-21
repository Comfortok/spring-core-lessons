package com.epam.spring.core.logger;

import com.epam.spring.core.bean.Event;

public class ConsoleEventLogger implements IEventLogger {

    @Override
    public void logEvent(Event event) {
        System.out.println(event);
    }
}