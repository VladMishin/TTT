package main.java;

import java.awt.*;

import main.java.Figure;

public class Field {

    private static final int FIELD_SIZE = 3;

    private static final int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = FIELD_SIZE;

    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    //private int numberPosition;
    //private Player status;
    //private Player[] figureInField;

    public int getSize (){
        return FIELD_SIZE;
    }

    public Figure getFigure (final Point point){
        return field[point.x][point.y];
    }

    public void setFigure (final Point point, final Figure figure){
        this.field[point.x][point.y] = figure;
    }

    private boolean checkPoint (final Point point){
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate (final int coordinate){
        return coordinate >= MIN_COORDINATE && coordinate <= MAX_COORDINATE;
    }

}
