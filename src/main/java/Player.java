package main;

import main.java.Figure;

/**
 * Created by User on 03.10.2017.
 */
public class Player {
    private final String name;
    private final Figure figure;

    public void setNamePlayer(String name){
        this.name = name;
    }

    public String getNamePlayer () {
        return this.name;
    }

    public void setFigurePlayer(Figure figure){
        this.figure = figure;
    }

    public Figure getFigurePlayer () {
        return this.figure;
    }
}
