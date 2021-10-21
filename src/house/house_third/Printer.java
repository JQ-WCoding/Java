package house.house_third;

public class Printer {
    public static void print( House... h ) {
        for (House house : h) {
            house.print();
        }
    }
}
