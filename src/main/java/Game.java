package main.java;

import main.Player;

public class Game {
    private final String nameGame;

    private final Field[] fields;

    private final Player statusGame;

    public void serNameGame(String name){
        this.nameGame = name;
    }

    public String getNameGame(){
        return this.nameGame;
    }

   public void setFields (Field field) {
   //     fields[] = field; //вместо массива надо использовать коллекцию set
   }

   public Field[] getFileds (){
        return fields;
   }
}
