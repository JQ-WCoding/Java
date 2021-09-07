package Chapter3.ch3.OperatorEx;

public class OperatorEx32 {
    public static void main(String[] args) {
        int a, b, c;
        int absA, absB, absC;
        char signA, signB, signC;

        a = 10;
        b = -6;
        c = 0;
         /*
         삼항연산자의 조건식은 ()를 이용하여 가독성을 높이것도 센스이다
         아래의 문제는 양수인 경우 모두 전환
          */
        absA = (a >= 0) ? a : -a;
        absB = (b >= 0) ? b : -b;
        absC = (c >= 0) ? c : -c;

        // 조건 연산자의 중첩 -> a가 0보다 큰지 확인 -> false인 경우 a가 0 인지 확인하여 참 거짓에 따라 '-'부호가 결정된다
        signA = (a > 0) ? '+' : ((a == 0) ? ' ' : '-');
        signB = (b > 0) ? '+' : ((b == 0) ? ' ' : '-');
        signC = (c > 0) ? '+' : ((c == 0) ? ' ' : '-');

        System.out.printf("a = %c%d%n", signA, absA);
        System.out.printf("b = %c%d%n", signB, absB);
        System.out.printf("c = %c%d%n", signC, absC);
    }
}
