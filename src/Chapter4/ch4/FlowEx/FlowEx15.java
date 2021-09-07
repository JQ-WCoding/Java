package Chapter4.ch4.FlowEx;

public class FlowEx15 {
    public static void main(String[] args) {
        System.out.println("x \t 3*x \t 3*x-1 \t x*x \t x%2 \t x/3");
        System.out.println("---------------------------------------------");


        for (int i = 1; i < 10; i++) {
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d%n", i, 3 * i, 3 * i - 1, i * i, i % 2, i / 3);
        }

    }
}
