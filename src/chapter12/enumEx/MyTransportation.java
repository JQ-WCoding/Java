package chapter12.enumEx;

public abstract class MyTransportation extends MyEnum {
    static final MyTransportation BUS = new MyTransportation("BUS", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation TRAIN = new MyTransportation("TRAIN", 200) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected MyTransportation(String name, int basicFare) {
        super(name);
        BASIC_FARE = basicFare;
    }

    abstract int fare(int distance);

    protected final int BASIC_FARE;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
