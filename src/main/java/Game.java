package main.java;

import main.java.Player;

import main.java.Field;

public class Game {

    private  String nameGame;

    private  Field[] fields;

    private  Player statusGame;

    public void serNameGame(String name){
        this.nameGame = name;
    }

    public String getNameGame() {
        return this.nameGame;
    }

   public void setFields (Field field) {
   //     fields[] = field; //вместо массива надо использовать коллекцию set
   }

   public Field[] getFileds() {
        return fields;
   }
}
