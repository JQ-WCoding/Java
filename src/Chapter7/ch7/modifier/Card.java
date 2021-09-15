package Chapter7.ch7.modifier;

public class Card {
    // final을 사용하여 각각 다른 타입의 상수(변하지 않는 값)으로 선언
    final int NUMBER;
    final String KIND;

    // 매개변수를 해당
    Card(String kind, int num) {
        // 상수이기도 하고 변수명이 다르기 때문에 this. 로 표현하지 않아도 Card의 변수에 올바르게 초기화 가능
        KIND = kind;
        this.NUMBER = num;
    }

    // 기본 생성자 -> KIND를 SPADE와 숫자 7로 초기화
    Card() {
        this("SPADE", 7);
    }

    // toString() 오버라이딩 하여 새로운 문자열을 반환한다
    @Override
    public String toString() {
        return KIND + " , " + NUMBER;
    }
}
