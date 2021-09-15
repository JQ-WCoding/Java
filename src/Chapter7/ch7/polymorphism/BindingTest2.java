package Chapter7.ch7.polymorphism;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent parent = new Child2();
        Child2 child = new Child2();

        /*
        아래와 같이 상속받은 자식에 정의된 것들이 없다면,
        따로 구분지을 이유가 없기 때문에 부모클래스의 메소드와 멤버 변수들을 호출한다
        상속받은 자식 클래스에도 동일한 이름의 변수명 혹은 메소드가 있을 경우 구분이 필요할뿐
        이외에는 구분지을 이유 없이 해당 변수 혹은 메소드를 호출가능 하다
         */
        System.out.println("parent.x : " + parent.x);
        parent.call();

        System.out.println("child.x : " + child.x);
        child.call();
    }
}

