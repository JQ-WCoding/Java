package Chpater7.ch7.overriding;

public class Point2 {
    int x = 1, y = 2;

    Point2(int x, int y) {
        // super(); 컴파일러가 자동 생성 -> Object() 클래스의 생성자를 의미함
        this.x = x;
        this.y = y;
    }
}