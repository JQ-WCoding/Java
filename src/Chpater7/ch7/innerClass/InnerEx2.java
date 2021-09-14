package Chpater7.ch7.innerClass;

import Chpater7.ch7.myInterface.interfaceTest2.I;

public class InnerEx2 {
    class InstanceInner {
    }

    static class StaticInner {
    }

    // 인스턴스멤버 간 직접 접근 가능
    InstanceInner instanceInner = new InstanceInner();
    // static 멤버 간 직접 접근 가능
    static StaticInner staticInner = new StaticInner();

    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner(); -> 인스턴스 멤버는 static 메소드에 직접 접근할 수 없다
        StaticInner obj2 = new StaticInner();

        // 객체 생성(인스턴스화)를 통해 접근 가능하다
        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.instanceInner;
    }

    void instanceMethod() {
        // 인스턴스멤버와 static 모두 사용가능 하다
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
//        LocalInner localInner = new LocalInner(); -> method() 내에 지역으로 선언된 클래스는 외부에서 접근 불가능
    }

    void method() {
        class LocalInner {
        }
        LocalInner localInner = new LocalInner();
    }
}
