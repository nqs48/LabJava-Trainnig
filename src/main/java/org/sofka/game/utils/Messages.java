package org.sofka.game.utils;

import org.jboss.logging.Logger;

public class Messages {
    private static final Logger LOGGER = Logger.getLogger(Messages.class);

    private Messages() throws IllegalAccessException {
        throw new IllegalAccessException("Utils Class");

    }

    public static void printMessage(String message) {
        LOGGER.info(message);
    }
}
