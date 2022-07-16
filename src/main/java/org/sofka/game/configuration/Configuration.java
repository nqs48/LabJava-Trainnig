package org.sofka.game.configuration;

import org.sofka.game.utils.Messages;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {
    private static final String PATH = "src/main/resources/aplication.properties";

    private Configuration() throws IllegalAccessException {
        throw new IllegalAccessException("Utils Class");
    }

    public static Properties environmentProperties() {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(PATH)) {
            properties.load(fileInputStream);
        } catch (Exception e) {
            Messages.printMessage(e.getMessage());
        }
        return properties;
    }
}
