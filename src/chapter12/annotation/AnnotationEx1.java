package chapter12.annotation;

public class AnnotationEx1 {
    class Parent{
        void parentMethod(){}
    }

    class Child extends Parent{
        // 오버라이딩한다는 어노테이션을 통해 -> 인지를 시켜줌
        // 물론 상속받은 부모 클래스의 메소드 명칭과 동일해야한다
        @Override
        void parentMethod() {

        }
    }
}
