package chapter11;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(3));
        list1.add(new Integer(2));
        list1.add(new Integer(1));
        list1.add(new Integer(0));

        ArrayList list2 = new ArrayList(list1.subList(1,4));

    }
}
