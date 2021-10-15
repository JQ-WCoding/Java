package chapter12.annotation;

public class NewClass {
    int newField;

    @Deprecated
    int oldField;

    public int getNewField() {
        return newField;
    }

    @Deprecated
    public int getOldField() {
        return oldField;
    }
}
