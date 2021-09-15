package Chapter7.ch7.innerClass;

public class InnerEx6 {
    /*
     익명 클래스 선언 법 -> 단 하나의 클래스를 상속받거나 인터페이스 구현 가능
     이름이 없기 때문에 생성자도 가질 수 없다 -> 선언과 생성을 동시에 하며 단 한번만 사용가능한 일회성 클래스
     */
    Object inner = new Object() {
        void method() {
        }
    };

    // static 익명 클래스
    static Object classV = new Object() {
        void method() {
        }
    };

    // method() 내부의 익명클래스 선언
    void method() {
        Object lv = new Object() {
            void method() {
                System.out.println("hi lv");
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(classV); // 존재 확인 가능 (주소 출력)
        new InnerEx6().method(); // 실험용
    }
}
