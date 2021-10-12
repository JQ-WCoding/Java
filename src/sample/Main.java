package sample;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"blue", "triangle", "circle"};
        House h = Worker.makeHouse(strs);
        Worker.print(h);
    }
}
