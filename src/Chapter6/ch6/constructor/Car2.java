package Chapter6.ch6.constructor;

public class Car2 {
    String color;
    String type; // Sedan, SUV 로 구분
    int door; // 문(coupe, normal)

    /*
     해당 생성자를 만들었기 때문에 하단의 생성자도 사용가능 -> 매개변수 지정 문제
     this가 의미하는 것은 Car로 인스턴스화 되는 자신을 의미한다
     this()묶는 경우 메소드를, this.인스턴스 변수를 작성시 본인의 값을 초기화
     */
    public Car2(String color, String type, int door) {
        this.color = color;
        this.type = type;
        this.door = door;
    }

    // 매개변수 color만 받는 생성자는 인스턴화시, 인자값으로 String형만 준다면 기본 값으로 type 과 door가 "Sedan", 2로 인스턴스 변수가 초기화 되어 생성된다
    Car2(String color) {
        this(color, "Sedan", 2);
    }

    // 인자값을 아무것도 지정하지 인스턴스화 한다면, color, type, door 인스턴스 변수가 아래의 생성자에 들어있는 값으로 초기화 되어 생성된다.
    Car2() {
        this("white", "Sedan", 2);
    }
}
