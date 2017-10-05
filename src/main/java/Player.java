package main;

import main.java.Figure;

public class Player {

    private String name;

    private Figure figure;

    public void setNamePlayer(String name1){
        this.name = name1;
    }

    public String getNamePlayer () {
        return this.name;
    }

    public void setFigurePlayer(Figure figure){
        this.figure = figure;
    }

    public Figure getFigurePlayer () {
        return figure;
    }
}