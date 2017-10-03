/**
 * Created by User on 03.10.2017.
 */
public class Game {
    private final String name;
    private final Field[] fields;
    private final Player statusGame;

    public void serNameGame(String name){
        this.name = name;
    }

    public String getNameGame(){
        return name;
    }

   public void setFields (Field field) {
        field[] = field; //вместо массива надо использовать коллекцию set
   }

   public Field[] getFileds (){
        return fields;
   }


}
