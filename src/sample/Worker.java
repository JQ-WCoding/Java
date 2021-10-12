package sample;

public class Worker {
    public static House makeHouse(String[] materials) {
        House h = new House();
        h.setHouse(materials);
        return h;
    }

    public static void print(Show show) {
        show.printOver();
    }
}
