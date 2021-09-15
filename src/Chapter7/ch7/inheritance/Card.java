package Chapter7.ch7.inheritance;

public class Card {
    // 상수로 선언 -> 카드의 종류와 갯수와 변동될 일이 없이 때문에 클래스 변수(static)이며 상수형으로 선언
    static final int KIND_MAX = 4; // 카드 종류 : 총 4개
    static final int NUM_MAX = 13; // 한 종류의 카드 숫자 : 13;

    // 카드 종류 상수로 표현 1,2,3,4 각각 카드의 종류를 의미
    static final int SPADE = 1;
    static final int DIAMOND = 2;
    static final int HEART = 3;
    static final int CLOVER = 4;

    int kind;
    int number;

    // 기본 생성자 -> kind는 SPADE(1) 과 number 1로 인스턴스변수의 값이 초기화된다
    Card() {
        this(SPADE, 1);
    }

    // 매개변수를 이용하여 인스턴스변수 값을 생성과 특정 값으로 동시에 초기화하는 생성자
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    /*
     기본적으로 모든 클래스에 포함되어 있는 toString() 메소드는 overriding 하여 사용자의 정의에 맞게 구성가능하다
     현재 정의한 toString() 메소드는 해당 클래스의 구성 요소를 문자열로 반환해주는 메소드
     */
    @Override
    public String toString() {
        String[] kinds = {"", "SPADE", "DIAMOND", "HEART", "CLOVER"};
        String numbers = "123456789XJQK"; // 0 대신 한칸 띄어쓰기로 표현 -> 띄어쓰기 한 이유는 charAt()메소드가 0부터 시작하기 때문에 카드의 숫자를 1부터 표현하기 위해 한칸 띄워 사용

        return "kind : " + kinds[this.kind] + " , number : " + numbers.charAt(this.number - 1); //  numbers에 띄어쓰기를 하지 않고 numbers.charAt(this.number-1)로 사용도 가능
    }
}