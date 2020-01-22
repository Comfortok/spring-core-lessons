package com.epam.spring.core.spring;

import com.epam.spring.core.logger.CacheFileEventLogger;
import com.epam.spring.core.logger.CombinedEventLogger;
import com.epam.spring.core.logger.FileEventLogger;
import com.epam.spring.core.logger.IEventLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;

@Configuration
public class LoggerConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigIn() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Resource(name = "consoleEventLogger")
    private IEventLogger consoleEventLogger;

    @Resource(name = "fileEventLogger")
    private FileEventLogger fileEventLogger;

    @Resource(name = "combinedEventLogger")
    private CombinedEventLogger combinedEventLogger;

    @Resource(name = "cacheFileEventLogger")
    private CacheFileEventLogger cacheEventLogger;

    @Bean
    public Collection<IEventLogger> combinedLoggers() {
        Collection<IEventLogger> loggers = new ArrayList<>(2);
        loggers.add(consoleEventLogger);
        loggers.add(fileEventLogger);
        return loggers;
    }

    @Bean
    public IEventLogger defaultLogger() {
        return cacheEventLogger;
    }
}
