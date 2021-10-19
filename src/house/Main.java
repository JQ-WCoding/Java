package house;

public class Main {
    public static void main( String[] args ) {
        Show houseA = Worker.getObj( "house" );
        houseA.setMaterials( "A", "A", "A", "A" );

        Worker.print( houseA );
    }
}
