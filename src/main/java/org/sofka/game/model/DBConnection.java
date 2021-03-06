package org.sofka.game.model;

import org.sofka.game.configuration.Configuration;

import java.util.Properties;

/**
 * @author Nestor Quiroga
 * @author Victor Roca
 * Class DBConnection
 */
public class DBConnection {

    private static Properties properties = Configuration.environmentProperties();
    private final String driver = properties.getProperty("driver");
    private final String user = properties.getProperty("user");
    private final String password = properties.getProperty("password2");;
    private final String password1 = "";
    private final String url = properties.getProperty("url2");

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
