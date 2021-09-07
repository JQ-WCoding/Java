package Chapter3.ch3.OperatorEx;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 2_000_000;
        int b = 3_000_000;

        // int * int 이기에 -> 값은 int형으로 출력된 값을 long형에 대입되기에 원하는 값이 안나옴
        long c = a * b;
        System.out.println(c);

        // (long)으로 형변환 시켜 값을 곱하면 조금 더 수월하게 계산가능하다
        long d = (long) a * b;
        System.out.println(d);
    }
}
