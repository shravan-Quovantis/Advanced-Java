package com.company.loggercodes;

import java.util.logging.Logger;

public class LoggerDriver {
    private final static Logger logger = Logger.getLogger(LoggerDriver.class.getName());

    public static void main(final String[] args) {

        //logger.setLevel(Level.FINEST);   //not required
        int i =10;
        logger.info("Hello "+ i);
        logger.severe("Hello");
        logger.warning("Hello");

        //Doubt: Why this methods are not printing anything?
        logger.config("Hello");
        logger.fine("Hello");
        logger.finer("Hello");
        logger.finest("Hello");

    }
}
