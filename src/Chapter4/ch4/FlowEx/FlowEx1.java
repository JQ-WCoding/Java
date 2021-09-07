package Chapter4.ch4.FlowEx;

public class FlowEx1 {
    public static void main(String[] args) {
        int a = 0;
        check(a);

        a = 3;
        check(a);
    }

    private static void check(int a) {
        System.out.printf("x = %d -> true : %n", a);
        // 0과 같은 경우
        if (a == 0) System.out.println("a == 0");
        // 0이 아닐 경우
        if (a != 0) System.out.println("a != 0");
        // 0이 아닐경우
        if (!(a == 0)) System.out.println("!(a == 0)");
        // 부정의 부정임으로 긍정을 표현 -> 0이 아님이 아닐경우
        if (!(a != 0)) System.out.println("!(a != 0)");
    }
}
