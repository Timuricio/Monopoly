package model;
/**
 * Created by Иван on 07.10.2017.
 */
public class GameField {
    static GameField gameField;

    private CyclicalLinkedList fields;

    private GameField() {
        /* fill the fields
        goFieln must be last
         */
    }

    public static GameField getInstance() {
        if(gameField != null)
            return gameField;
        return gameField = new GameField();
    }

}
