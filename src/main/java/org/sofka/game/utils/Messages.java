package org.sofka.game.utils;

import org.jboss.logging.Logger;

public class Messages {
    private static final Logger LOGGER = Logger.getLogger(Messages.class);

    private Messages() throws IllegalAccessException {
        throw new IllegalAccessException("Utils Class");

    }

    public static String printMessage(String message) {
        LOGGER.info(message);
        return message;
    }

    public static String printWarning(String message) {
        LOGGER.warn(message);
        return message;
    }

    public static String printError(String message) {
        LOGGER.error(message);
        return message;
    }
}
