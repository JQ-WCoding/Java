package Chpater7.ch7.polymorphism;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent parent = new Child3();
        Child3 child = new Child3();

        System.out.println("parent.x : " + parent.x); // 부모의 인스턴스 변수 호출
        parent.call(); // parent.call()은 결국 Child에 오버라이딩한 call() 메소드를 실행한다
        // Child의 call() 내의 x는 child의 메소드로 child의 변수를 참조하여 계산한다
        // 따라서, parent.x와 child.x 에서만 비교가 가능할 뿐 parent.call()과 child.call()은 같은 메소드를 동일하게 실행하면 동일한 변수를 참조한다

        System.out.println();

        System.out.println("child.x : " + child.x);
        child.call();
    }
}

