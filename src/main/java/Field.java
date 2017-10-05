package main.java;

import main.java.Player;

public class Field {
    private final int sizeField;
    private final int numberPosition;
    private final Player status;
    private final Player[] figureInField;

    public void setFigureInField (Player player, int position){
        figureInField[position] = player;
        //    if () {
        // status = player;
       //   }

    }

    public void setSizeField(int size) {
        this.sizeField = size;
    }

    public String getStatus (){
        return this.status;
    }

    public void setNumberPosition (int position) {
        this.numberPosition = position;
    }

    public int getNumberPosition (){
        return this.numberPosition;
    }
}
