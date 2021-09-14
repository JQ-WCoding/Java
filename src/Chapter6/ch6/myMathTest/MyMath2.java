package Chapter6.ch6.myMathTest;

public class MyMath2 {
    /*
 인스턴스 변수와 매소드
 메소드에 인자값을 받지 않아도 인스턴스 변수를 통해 계산이 가능하다 즉, 인스턴스화 후, 해당 참조변수의 인스턴스 변수에 값 초기화를 통해 메소드 활용 가능
 */
    long a, b;

    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    long divide() {
        return a / b;
    }
}
