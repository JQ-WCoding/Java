package Chapter7.ch7.polymorphism;

public class CastingTest2 {
    public static void main(String[] args) {
        // 참조변수 car1은 Car 객체를 인스턴스화
        Car car1 = new Car();
        Car car2 = null;
        FireEngine fireEngine = null;

        FireEngine fireEngine2 = new FireEngine();

        car1.drive(); // drive() 메소드는 실행되어 drive! 출력

        // 참조변수 fireEngine 은 car 클래스를 상속받은 자식 클래스의 객체이다
        // 부모 클래스의 인스턴스화된 참조변수를 자식클래스에 초기화할 수 없다 -> 어떤 변경점이 일어 났을지 모르기 때문에
        // 자식이 상속받아야하는 값들과 다른 값들이 생길 수 있다
        fireEngine = (FireEngine) car1; // -> ClassCastException 오유 발생
        fireEngine.drive(); // 해당 drive는 실행되지 않는다

        // 하단문구가 상단의 오류 때문에 실행되지 않아 추가로 작성
        car2 = fireEngine; // 해당 참조변수는 fireEngine이 null이기 때문에 drive() 메소드가 실행되지 않는다
        // -> 추가적으로 인스턴스화한 경우 실행되는지 한번 만들어봄 -> 당연히 가능.. 자식클래스를 인스턴스화한 참조변수 부모클래스로 형변환 가능
//        car2 = fireEngine2;
        car2.drive();
    }
}
