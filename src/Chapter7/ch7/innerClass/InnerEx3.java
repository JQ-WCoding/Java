package Chapter7.ch7.innerClass;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 10;

    class InstanceInner {
        // inner 클래스의 외부 클래스의 private 멤버도 접근 가능
        int iiv = outerIv;
        // static 은 당연히 접근 가능 -> 전역
        int iiv2 = outerCv;
    }

    static class StaticInner {
        //        int siv = outerIv; -> static 클래스는 인스턴스 멤버 접근 불가 - outerIv에 접근 불가능
        // static 멤버는 접근 가능 -> 선언도 static?
        static int scv = outerCv;
        int configure = outerCv; // 선언 가능
    }

    void method() {
        int lv = 0;
        final int LV = 10; // 1.8버전 이후 final 생략 가능 -> 상수 선언시 그럼 대문자로 구분??
        class LocalInner {
            // InnerEx3의 멤버 변수 모두 접근 가능하며 -> public 메소드이기에 인스턴화 후 실행가능
            // static 변수도 접근 당연히 가능
            int liv = outerIv;
            int liv2 = outerCv;

            int liv3 = lv; // final이 붙은 상수만 접근가능 하지만 현재 에러가 안나는 이유는 -> jdk1.8 버전이기 때문에
            int liv4 = LV; // 지역변수인 lv와 LV모두 접근가능하다
        }
    }
}
