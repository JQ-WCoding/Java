package Chapter4.ch4.FlowEx;

public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100) break;

//            ++i;
            i++; // ++i 와 i++ 두 경우 모두 상관없이 동일한 값으로 표현된다
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
