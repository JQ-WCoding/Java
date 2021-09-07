package Chapter4.ch4.FlowEx;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 3;
        // ? 이해가 안가네
        while (i-- != 0) {
            System.out.println(i);
        }
        System.out.println("------------------");

        for (int j = 3; j > 0; j--) {
            System.out.println(j);
        }

        System.out.println("-------------------");

        i = 3;
        while (--i != 0) {
            System.out.println(i);
        }
    }
}
