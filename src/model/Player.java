package model;
/**
 * Created by Иван on 07.10.2017.
 */
public class Player {
    private String name;
    private int cash;
    private Field currentField;

    public Player(String name, int cash, Field currentField) {
        this.name = name;
        this.cash = cash;
        this.currentField = currentField;
    }
}
