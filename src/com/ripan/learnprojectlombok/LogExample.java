package com.ripan.learnprojectlombok;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * generate logger for our class.
 * It helps developers avoid manually creating a logger instance by automating the process based on the logging framework in use.
 * Lombok provides multiple variations of the @Log annotation,
 * some log variety are: @Log4j2, @Log4j, @Logback, @Slf4j, @Log, @LogFactory
 */

@Log
public class LogExample {

    public void demoMethod(){
        log.info("we are using @Log annotation.");
    }
}
