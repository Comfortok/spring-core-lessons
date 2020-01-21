package com.epam.spring.core.logger;

import com.epam.spring.core.bean.Event;

public interface IEventLogger {
    void logEvent(Event event);
}