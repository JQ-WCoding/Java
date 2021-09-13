package Chpater7.ch7.overriding;

public class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y); // super()를 통해 조상 생성자를 실행하여 필요한 인스턴스 변수들을 먼저 초기화 시켜주어야한다 -> Point의 기본생성자를 의미

        /*
         this.x와 this.y의 경우 상속받은 Point의 인스턴스 변수들을 참조하는데 해당 인스턴스 변수가 초기화 되어 있지 않으면 사용불가능하다 -> 순서가 자식클래스를 읽어들이고 부모 클래스를 읽어들이는 순서로
         과정을 거쳐가는데 자식 클래스를 사용할때 아직 부모클래스는 선언도 되어 있지 않다 -> 따라서, 기본값으로 초기화도 선언도 되어있지 않은 부모 클래스의 인스턴스 변수를 사용하려면 super를 이용해 먼저 부모클래스 생성자를
         실행 후 자식 클래스의 생성자가 실행되어야한다
         */
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // 부모클래스의 getLocation 메소드를 오버라이딩한 자식클래스의 getLocation 메소드
    @Override
    String getLocation() {
        return "x : " + x + " y : " + y + " z : " + z;
    }
}
