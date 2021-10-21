package house.houseSecond;

public class DefaultHouse implements Show {
    String roof = "red";
    String window = "star";
    String door = "square";

    @Override
    public void print() {
        System.out.println( "Roof : " + roof + " / Window : " + window + " / Door : " + door );
    }
}
