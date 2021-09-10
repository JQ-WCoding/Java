package Chpater7.ch7.polymorphism;

public class CastingTest1 {
    public static void main(String[] args) {
        // Car 참조변수 선언
        Car car = null;
        // FireEngine 두가지 선언
        FireEngine fireEngine1 = new FireEngine();
        FireEngine fireEngine2 = null;

        //fireEngine1은 FireEngine 객체를 인스턴스화한 참조변수이기 때문에 FireEngine 의 water() 메소드를 호출할 수 있다
        fireEngine1.water();
        // 참조변수 car 에 fireEngine1으로 초기화 한다
        car = (Car) fireEngine1; // (Car) 부분 생략 가능 : 해당 fireEngine 은 water() + Car 의 drive(), stop() 등을 모두 포함하고 있지만
        // 참조변수 car 는 Car 를 인스턴스화기에 더 작은 범위이자 부모이기에 형변환 생략이 가능하다
//        car.water();
        // 자식 클래스에서 인스턴스화된 참조변수를 부모클래스에 사용하는 것은 가능
        fireEngine2 = (FireEngine) car; // fireEngine2는 참조변수 car 의 자식클래스 임으로 더욱 큰 범위이다. 따라서, 해당 값으로 초기화 하면 참조변수 car 의 멤버 변수들이 같은 값으로
        // 초기화 되면 추가적인 fireEngine 의 water() 메소드를 호출할 수 있다.
        fireEngine2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive!");
    }

    void stop() {
        System.out.println("Stop!!");
    }
}

// Car 클래스를 상속받은 FireEngine
class FireEngine extends Car {
    // water 메소드의 사용 여부
    void water() {
        System.out.println("Water! ");
    }
}

