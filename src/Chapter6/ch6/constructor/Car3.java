package Chapter6.ch6.constructor;

public class Car3 {
    String color;
    String type; // Sedan, SUV 로 구분
    int door; // 문(coupe, normal)

    Car3() {
        this("white", "coupe", 2);
    }

    // 매개변수 Car3 객체를 통해 모든 인스턴스 변수를 초기화하는 생성자
    Car3(Chapter6.ch6.constructor.Car3 car) {
        color = car.color;
        type = car.type;
        door = car.door;
    }

    Car3(String color, String type, int door) {
        this.color = color;
        this.type = type;
        this.door = door;
    }
}
