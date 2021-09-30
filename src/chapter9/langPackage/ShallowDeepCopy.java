package chapter9.langPackage;

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle circle1 = new Circle(new Point2(2, 2), 4.0);
        Circle circle2 = circle1.shallowCopy();
        Circle circle3 = circle1.deepCopy();

        System.out.println("c1 : " + circle1);
        System.out.println("c2 : " + circle2);
        System.out.println("c3 : " + circle3);

        circle1.point.x = 10;
        circle1.point.y = 10;

        System.out.println("c1 : " + circle1);
        System.out.println("c2 : " + circle2);
        System.out.println("c3 : " + circle3);

        // 객체 주소값으로 확인 하니 전부 달랐는데 Point 가 중요했음
        System.out.println(circle1.hashCode());
        System.out.println("c1 hashcode : " + System.identityHashCode(circle1.hashCode()));
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));
        System.out.println(circle2.equals(circle3));
        System.out.println("c2 hashcode : " + System.identityHashCode(circle2.hashCode()));
        System.out.println("c3 hashcode : " + System.identityHashCode(circle3.hashCode()));
        /*
         찾았다 -> Circle 객체는 전부 다른 주소지만 지역변수로 선언한 Point 객체를 같은 곳에서 참조하는 것과
         Point 객체까지 새로 인스턴화 하여 완전히 분리된 형식
         */
        System.out.println(circle1.point.equals(circle2.point));
        // 따라서 깊은 복사를 한 circle3 의 point 객체는 circle1 의 point 객체와는 주소가 다르다
        System.out.println(circle1.point.equals(circle3.point));
    }
}
