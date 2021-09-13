package Chapter6.ch6.constructor;

public class CarTest {
    public static void main(String[] args) {

        //car1의 경우 기본생성자를 통해 인스턴스화하였다. 이후 각각의 인스턴스 변수를 원하는 값에 맞게 초기화 하여 진행
        Car car1 = new Car();
        car1.color = "white";
        car1.type = "Sedan";
        car1.door = 2;

        /*
         car2의 경우 재정의한 생성자를 통해 필요한 매개변수에 맞게 인자값을 대입하여 car2를 인스턴스화함과 동시에 해당 인스턴스 변수의 값을 초기화
         -> car2의 인스턴스 변수값을 직관적으로 볼 수 있고, 간결해지는 장점이 있다
         */
        Car car2 = new Car("black", "SUV", 4);
        System.out.printf("car1 : %s\t%s\t%d\n", car1.color, car1.type, car1.door);
        System.out.printf("car2 : %s\t%s\t%d\n", car2.color, car2.type, car2.door);
    }
}
