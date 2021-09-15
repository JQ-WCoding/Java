package Chapter7.ch7.innerClass;

public class InnerEx5 {
    public static void main(String[] args) {
        // Outer 클래스 인스턴스화 우선
        Outer2 outer = new Outer2();
        // Outer 클래스의 내부 클래스 Inner 인스턴스화
        Outer2.Inner inner = outer.new Inner();
        // 참조변수 inner 의 method() 호출
        inner.method();
    }
}

class Outer2 {
    int num = 1;

    class Inner {
        int num = 2;

        void method() {
            int num = 3;
            System.out.println("num : " + num); // 지역변수인 num = 3 을 호출
            // this 가 붙어 클래스 자신의 num 을 의미
            System.out.println("this.num : " + this.num); // 즉, Inner 클래스의 인스턴스 변수 num = 2 를 의미
            System.out.println("Outer2.this.num : " + Outer2.this.num); // Outer 클래스 자신의 num 을 의미
        }
    }
}
