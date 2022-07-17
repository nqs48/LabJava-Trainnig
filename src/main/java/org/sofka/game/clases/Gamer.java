package org.sofka.game.clases;

import org.sofka.game.model.DBConnection;

/**
 * @author Nestor Quiroga
 * @author Victor Roca
 * Class Gamer
 */
public class Gamer {
    DBConnection data = new DBConnection();

    /**
     * Gamer's name
     */
    private String name;

    /**
     * Gamer's email
     */
    private String email;

    /**
     * Gamer's score
     */
    private Integer score;

    /**
     * Constructor class Gamer
     * @param name value to set a gamer name
     * @param email value to set a gamer email
     */
    public Gamer(String name, String email) {
        this.name = name;
        this.email = email;
        this.score = 0;
    }

    /**
     * Gets the current value for name
     * @return returns name, type String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new name to gamer
     * @param name Contains the new name to set, type String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the current value for email
     * @return returns email, type String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value for email, type String
     * @param email Contains the new email to set, type String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the current value for score
     * @return returns score, type integer
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Sets the  value for score, type Integer
     * @param score Contains the new score to set, type String
     */
    public void setScore(Integer score) {
        this.score = score;
    }

}
