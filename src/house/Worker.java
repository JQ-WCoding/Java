package house;

public class Worker {
    public static void print( Show s ) {
        s.printAll();
    }

    public static Show getObj( String architect ) {
        if (architect.equalsIgnoreCase( "House" )) {
            return new House();
        }

        return null;
    }
}
