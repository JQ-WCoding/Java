package Chapter6.ch6.constructor;

public class Car {
    String color;
    String type; // Sedan, SUV 로 구분
    int door; // 문(coupe, normal)

    Car() {

    }

    Car(String color, String t, int d) {
        // this 를 사용해 해당 인스턴스 변수 color을 찾아 매개변수 color의 값을 초기화 할 수 있다
        this.color = color;
        // 만약 매개변수명과 인스턴스 변수명이 같으면 this. 없이 정의할 수 없기 때문에 이런경우 다른 명으로 설정해주어야한다
        type = t;
        door = d;
    }
}
