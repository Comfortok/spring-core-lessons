package com.epam.spring.core.logger;

public abstract class AbstractLogger implements EventLogger {

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    protected abstract void setName(String name);
}