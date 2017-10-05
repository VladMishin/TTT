package main;

import main.java.Figure;

/**
 * Created by User on 03.10.2017.
 */
public class Player {
    private final String name;

    private final Figure figure;

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
