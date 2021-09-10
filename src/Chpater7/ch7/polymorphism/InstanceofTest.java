package Chpater7.ch7.polymorphism;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fireEngine = new FireEngine();

        if (fireEngine instanceof FireEngine) {
            System.out.println("FireEngine instance");
        }

        if (fireEngine instanceof Car) {
            System.out.println("Car instance");
        }

        if (fireEngine instanceof Object) {
            System.out.println("Object instance");
        }
        /*
        실행결과 : 3가지 if문 모두 true로 3개의 출력문이 모두 출력된다.
        -> 즉 FireEngine이라는 자식 클래스는 Car, Object(Car의 부모) 클래스를 모두 상속받는 클래스
        FireEngine < Car < Object로 Car 클래스에선 기본적으로 Object 클래스를 상속받고 있기 때문에 결과적으로 3조건문이
        모두 실행되었다
        ** 결론적으로, 어떤 타입에 대한 instanceof의 결과가 true라는 의미는 검사한 해당 타입으로 형변환에 문제가 없다는 의미
         */


        // 체인 형식 메소드 작성
        System.out.println(fireEngine.getClass().getName());
    }
}
