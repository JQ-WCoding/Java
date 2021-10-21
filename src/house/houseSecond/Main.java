package house.houseSecond;

public class Main {
    public static void main( String[] args ) {
        Show h1 = new DefaultHouse();
        Show h2 = new DoorHouse();
        Show h3 = new DefaultHouse();

        h1.print();
        h2.print();
        h3.print();
    }
}
