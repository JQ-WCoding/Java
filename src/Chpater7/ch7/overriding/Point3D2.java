package Chpater7.ch7.overriding;

public class Point3D2 extends Point {
    int z = 3;

    // Point3D2의 기본생성자
    Point3D2() {
        this(1, 2, 3);
    }

    Point3D2(int x, int y, int z) {
        super(x, y); // 부모클래스 Point의 기본생성자 -> 부모 클래스의 인스턴스 변수먼저 초기화 필요
        this.z = z;
    }
}
