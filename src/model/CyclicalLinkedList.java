package model;
/**
 * Created by Иван on 07.10.2017.
 */
public class CyclicalLinkedList {
    private Field goField;

    public void insert(Field f) {
        if(goField == null) {
            goField = f;
            goField.setNext(goField);
        } else {
            f.setNext(goField.getNext());
            goField.setNext(f);
            goField = f;
        }
    }
}
