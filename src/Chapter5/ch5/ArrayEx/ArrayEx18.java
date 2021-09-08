package Chapter5.ch5.ArrayEx;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] point = {{100, 100, 100}, {50, 20, 30}, {80, 90, 10}, {70, 0, 60}};

        int sum = 0;

        for (int i = 0; i < point.length; i++) {
            for (int j = 0; j < point[i].length; j++) {
                System.out.printf("point[%d][%d] = %d%n", i, j, point[i][j]);
            }
        }

        for (int[] temp : point) {
            for (int num : temp) {
                sum += num;
            }
        }

        System.out.println("sum = " + sum);
    }
}
