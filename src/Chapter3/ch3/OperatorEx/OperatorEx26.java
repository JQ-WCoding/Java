package Chapter3.ch3.OperatorEx;

public class OperatorEx26 {
    public static void main(String[] args) {
        /*
        OR연산 '||'의 경우 연산결과가 'true'일 확률이 높은 피연산자를 연산자의 왼쪽 (V) || () 에 두면 더 빠른 연산결과가 가능하다
        -> 또는 이기에 앞서 참을 검색하면 뒤를 확인하지 않고 바로 출력가능 하기에 추가적인 연산을 할 필요가 없어진다
        -> false가 높은 확률인 조건이 앞으로가면 모든 경우를 확인하고 뒤의 조건문에서 참을 찾아야하기에 비교적 연산의 속도가 증가할 확률이 높다
         */
        int a = 20;
        int b = 0;

        System.out.printf("a = %d, b = %d%n", a, b);
        // 첫번째 조건에서 바로 true
        System.out.printf("a != 0 || ++b != 0 = %b%n", a != 0 || ++b != 0);
        System.out.printf("a = %d, b = %d%n", a, b);

        // a가 0이고 에서 false이기에 바로 출력 가능
        System.out.printf("a == 0 && ++b != 0 = %b%n", a == 0 && ++b != 0);
        System.out.printf("a = %d, b = %d%n", a, b);
    }
}
