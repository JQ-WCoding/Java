package sample;

public class House implements Show {
    private String roof;
    private String window;
    private String door;

    public void setHouse(String[] materials) {
        this.roof = materials[0];
        this.window = materials[1];
        this.door = materials[2];
    }

    @Override
    public void printOver() {
        System.out.println(roof + window + door);
    }
}
