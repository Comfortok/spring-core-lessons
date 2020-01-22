package com.epam.spring.core.logger;

import com.epam.spring.core.bean.Event;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collection;

@Component
public class CombinedEventLogger implements IEventLogger {

    @Resource(name = "combinedLoggers")
    private Collection<IEventLogger> loggers;

    @Override
    public void logEvent(Event event) {
        for (IEventLogger eventLogger : loggers) {
            eventLogger.logEvent(event);
        }
    }
}