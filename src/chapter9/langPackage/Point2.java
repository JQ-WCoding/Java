package chapter9.langPackage;

public class Point2 {
    int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
