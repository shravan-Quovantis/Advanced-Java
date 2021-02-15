package com.company.loggercodes;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LogFourJDriver {
    private static final org.apache.log4j.Logger logger = Logger.getLogger(LogFourJDriver.class);

    public static void main(final String[] args) {
        BasicConfigurator.configure();
        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
    }
}
