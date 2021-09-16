package chapter9.langPackage;

public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE; // int 형의 가장 작은 값을 반환
        System.out.println("i = " + i);

        System.out.println("-i = " + -i); // 최소값에 +1 은 overflow 를 유발

        try {
            // negateExact() 부호를 바꿔주는 메소드
            /*
             if (a == Integer.MIN_VALUE) throw new ArithmeticException("integer overflow");
             return -a;
             int 형 내 가장 작은 수 -> ArithmeticException 예외가 발생
             아니라면 -a로 부호를 변경하여 반환
             */
            System.out.printf("negateExact(%d) = %d%n", 10, Math.negateExact(10));
            System.out.printf("negateExact(%d) = %d%n", -10, Math.negateExact(-10));
            // 예외 발생 -> catch 블록으로 이동
            System.out.printf("negateExact(%d) = %d%n", i, Math.negateExact(i));
        } catch (ArithmeticException ae) {
            // 상단의 stackoverflow 예외를 해결하기 위해 (long)으로 형변환하여 출력하도록 함 -> long 이 int 보다 저장 범위가 훨씬 넓기 때문에 long 형변환으로 해결
            System.out.printf("negateExact(%d) = %d%n", (long) i, Math.negateExact((long) i));
        }
    }
}
