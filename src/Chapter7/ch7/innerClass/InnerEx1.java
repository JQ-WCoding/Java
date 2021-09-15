package Chapter7.ch7.innerClass;

public class InnerEx1 {
    // 클래스가 static 이 아니기에 내부 클래스의 경우엔 멤버변수 접근자로 static 사용 불가능?
    class InstanceInner {
        int a = 1000;
        //        static int b = 100;
        // final static 은 상수이기에 허용
        final static int CONST = 1;
    }

    static class StaticInner {
        int a = 2000;
        static int b = 20;
    }

    void method() {
        class LocalInner {
            int a = 3000;
            //            static int b = 300;
            final static int CONST = 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.b);
    }
}
