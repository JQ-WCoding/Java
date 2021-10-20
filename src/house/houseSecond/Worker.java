package house.houseSecond;

import java.util.Arrays;

public class Worker {
    static private int count;

    static void print( House... h ) {
        for (House house : h) {
            count++;
            System.out.print( count + " : " );
            System.out.println( house );
        }
    }
}
