/**
 * Created by User on 03.10.2017.
 */
public class Field {
    private final int sizeField;
    private final int numberPosition;
    private final Player status;
    private final Player[] figureInField;

    public void setFigureInField (Player player, int position){
        figureInField[position] = player);
        if () {
          status = player;
        }

    }

    public void setSizeField(int size) {
        this.sizeField = size;
    }

    public String getStatus (){
        return status;
    }

    public void setNumberPosition (int position) {
        this.numberPosition = position;
    }

    public int getNumberPosition (){
        return numberPosition;
    }
}
