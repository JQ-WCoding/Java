package Chpater7.ch7.innerClass;

public class InnerEx4 {
    public static void main(String[] args) {
//        Outer.InstanceInner inner = new Outer.InstanceInner(); // -> 실행되지 않음
        Outer outer = new Outer(); // -> 가장 최상위인 Outer 클래스를 먼저 생성해야 나머지를 생성할 수 있다
        Outer.InstanceInner inner = outer.new InstanceInner(); // -> 참조변수 outer 의 InstanceInner 클래스를 인스턴스화 하는 과정

        System.out.println("inner.iv : " + inner.iv);
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
//        System.out.println(Outer.cv); -> static 이지만 StaticInner 클래스의 멤버변수임을 명시해주어야 한다
        Outer.StaticInner staticInner = new Outer.StaticInner();
        // staticInner.iv는 인스턴스화를 통해 호출 가능
        System.out.println("staticInner.iv : " + staticInner.iv);
    }
}

class Outer {
    // 인스턴스 내부 클래스
    class InstanceInner {
        int iv = 1;
    }

    // static 내부 클래스
    static class StaticInner {
        int iv = 2;
        static int cv = 3;
    }

    // public 메소드
    void method() {
        // 지역 클래스에 인스턴스 변수 선언 및 초기화
        class LocalInner {
            int iv = 4;
        }
    }
}