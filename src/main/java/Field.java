package main.java;

import main.Player;

public class Field {
    private int sizeField;

    private int numberPosition;

    private Player status;

    private Player[] figureInField;

    public void setFigureInField (Player player, int position){
        this.figureInField[position] = player;

        //    if () {
        // status = player;
       //   }

    }

    public void setSizeField(int size) {
        this.sizeField = size;
    }

    public Player getStatus (){
        return this.status;
    }

    public void setNumberPosition (int position) {
        this.numberPosition = position;
    }

    public int getNumberPosition (){
        return this.numberPosition;
    }
}
