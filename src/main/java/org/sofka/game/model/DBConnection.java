package org.sofka.game.model;

import org.sofka.game.configuration.Configuration;

import java.util.Properties;

public class DBConnection {


    private static Properties properties = Configuration.environmentProperties();
    private final String driver = properties.getProperty("driver");
    private final String user = properties.getProperty("user");
    private final String password = properties.getProperty("password");;
    private final String password1 = "";
    private final String url = properties.getProperty("url");


    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

}
