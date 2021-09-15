package chapter9.langPackage;

public class CloneEx1 {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Point copy = (Point) point.clone();
        System.out.println(point);
        System.out.println(copy);
    }
}
