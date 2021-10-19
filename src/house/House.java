package house;

public class House implements Show {
    private String type;
    private String window;
    private String roof;
    private String door;

    @Override
    public void setMaterials( String type, String window, String roof, String door ) {
        this.type = type;
        this.window = window;
        this.roof = roof;
        this.door = door;
    }

    @Override
    public void printAll() {
        System.out.printf( "Type : %s, Window : %s, Roof : %s, Door : %s%n", type, window, roof, door );
    }
}
