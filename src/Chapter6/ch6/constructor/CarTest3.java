package Chapter6.ch6.constructor;

public class CarTest3 {
    public static void main(String[] args) {
        Car3 car1 = new Car3();
        // 참조변수 car2를 인스턴스화 할때 car1을 인자값으로 하여 생성자가 인스턴스화를 진행
        Car3 car2 = new Car3(car1);

        // 기본생성자로 인스턴스화 이후 값 출력
        System.out.println("Before");
        System.out.printf("car1 : %s\t%s\t%d\n",car1.color,car1.type,car1.door);
        System.out.printf("car2 : %s\t%s\t%d\n",car2.color,car2.type,car2.door);

        // 인스턴스 변수 car2.door의 값을 4로 초기화
        car2.door = 4;
        /*
         car2.door의 변경은 car1.door에 영향을 주지 않는다
         -> car1이 생성되어 참조하고 있는 heap영역의 메모리 주소와 car2의 주소는 다르기 때문에 위의 car1을 인자값으로 생성하였을때, car1의 인스턴스변수 값들만 복사
         */
        System.out.println("After");
        System.out.printf("car1 : %s\t%s\t%d\n",car1.color,car1.type,car1.door);
        System.out.printf("car2 : %s\t%s\t%d\n",car2.color,car2.type,car2.door);
    }
}

class Car3 {
    String color;
    String type; // Sedan, SUV 로 구분
    int door; // 문(coupe, normal)

    Car3() {
        this("white", "coupe", 2);
    }

    // 매개변수 Car3 객체를 통해 모든 인스턴스 변수를 초기화하는 생성자
    Car3(Car3 car) {
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
