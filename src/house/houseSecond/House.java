package house.houseSecond;

public class House {
    private String roof;
    private String door;
    private String window;

    public House() {
        setRoof("red");
        setDoor("square");
        setWindow("star");
    }

    public void setRoof( String roof ) {
        this.roof = roof;
    }

    public void setDoor( String door ) {
        this.door = door;
    }

    public void setWindow( String window ) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", door='" + door + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
