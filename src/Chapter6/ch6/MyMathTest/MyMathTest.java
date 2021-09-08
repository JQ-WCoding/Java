package Chapter6.ch6.MyMathTest;

public class MyMathTest {
    public static void main(String[] args) {
        // MyMath 인스턴스화
        MyMath math = new MyMath();
        // result1은 long형 7와 3을 더하는 메소드를 사용한 결과값이 반환되어 초기화된다
        long result1 = math.add(7L, 3L);
        // 빼기
        long result2 = math.subtract(7L, 3L);
        // 곱하기
        long result3 = math.multiply(7L, 3L);
        // 나누기
        double result4 = math.divide(7L, 3L); // 인자값으로 long형 7과 3을 주었지만 double 형변환되어 반환된다

        // 위의 변수 값 출력
        System.out.println("+ -> " + result1);
        System.out.println("- -> " + result2);
        System.out.println("* -> " + result3);
        System.out.println("/ -> " + result4);
    }
}
