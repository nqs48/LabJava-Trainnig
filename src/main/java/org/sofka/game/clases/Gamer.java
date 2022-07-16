package org.sofka.game.clases;

import org.sofka.game.model.DBConnection;
import org.sofka.game.utils.Messages;

import java.sql.*;

public class Gamer {
    DBConnection data = new DBConnection();

    private String name;
    private String email;
    private Integer score;

    public Gamer(String name, String email) {
        this.name = name;
        this.email = email;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
