package org.sofka.game.model;

public class DBConnection {

    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "root";
    private final String password1 = "";
    private final String url = "jdbc:mysql://localhost:8889/GameBDWho?useSSL=false";


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
