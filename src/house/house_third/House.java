package house.house_third;

public class House {
    String roof;
    String window;
    String door;

    House() {
        setWindow();
        setDoor();
        setRoof();
    }

    public void print() {
        System.out.println( "Roof : " + roof + " / Door : " + door + " / Window : " + window );
    }

    public void setRoof() {
        roof = "red";
    }

    public void setWindow() {
        window = "square";
    }

    public void setDoor() {
        door = "star";
    }
}
