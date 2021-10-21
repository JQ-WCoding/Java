package house.houseSecond;

public class DoorHouse extends DefaultHouse implements DoorSet {
    DoorHouse() {
        setDoor();
    }

    @Override
    public void setDoor() {
        door = "triangle";
    }
}
