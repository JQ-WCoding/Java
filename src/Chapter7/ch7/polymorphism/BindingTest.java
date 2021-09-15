package Chapter7.ch7.polymorphism;

public class BindingTest {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();

        /*
         참조변수 타입에 따라 조상타입에서 변수를 참조하면 부모의 인스턴스 변수가 호출되고
         자식타입으로 호출하면 자식의 인스턴스 변수가 호출된다
         하지만, 메소드의 경우 오바라이드된 자식의 메소드를 동일하게 사용한다
         */
        System.out.println("parent.x : " + parent.x);
        parent.call();

        System.out.println("child.x : " + child.x);
        child.call();
    }
}




