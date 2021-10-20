package house.houseSecond;

public class House2 extends House {

    House2() {
        super();
    }

    @Override
    public void setDoor( String door ) {
        door = "triangle";
        super.setDoor( door );
    }
}
