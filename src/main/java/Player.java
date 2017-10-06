package main.java;

public class Player {

    private final String name;

    private final Figure figure;

    public Player(final String name,
                  final Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getNamePlayer() {
        return this.name;
    }

    public Figure getFigurePlayer() {
        return figure;
    }
}