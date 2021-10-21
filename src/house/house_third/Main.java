package house.house_third;

public class Main {
    public static void main( String[] args ) {
        House h1 = new House();
        House h2 = new DoorHouse();
        House h3 = new House();

        Printer.print( h1, h2, h3 );
    }
}
