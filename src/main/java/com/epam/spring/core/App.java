package com.epam.spring.core;

import com.epam.spring.core.bean.Client;
import com.epam.spring.core.bean.Event;
import com.epam.spring.core.bean.EventType;
import com.epam.spring.core.logger.IEventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class App {

    private Client client;
    private IEventLogger defaultLogger;
    private Map<EventType, IEventLogger> loggers;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");
        Event event = ctx.getBean(Event.class);
        app.logEvent(EventType.INFO, event, "Some event for 1");
        event = ctx.getBean(Event.class);
        app.logEvent(EventType.ERROR, event, "Some event for 2");
        ((ClassPathXmlApplicationContext) ctx).close();
    }

    public App(Client client, IEventLogger eventLogger, Map<EventType, IEventLogger> loggers) {
        super();
        this.client = client;
        this.defaultLogger = eventLogger;
        this.loggers = loggers;
    }

    private void logEvent(EventType eventType, Event event, String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        event.setMessage(message);

        IEventLogger logger = loggers.get(eventType);
        if (logger == null) {
            logger = defaultLogger;
        }
        logger.logEvent(event);
    }
}