package org.sofka.game.clases;

import java.util.ArrayList;


public class Game {
    private Integer idGame;
    private final Gamer gamer;

    public Game(Gamer gamer) {
        this.gamer=gamer;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Gamer getGamer() {
        return gamer;
    }

}
