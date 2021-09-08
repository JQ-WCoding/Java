package Chapter5.ch5.MultiArrEx;

public class MutiArrEx3 {
    public static void main(String[] args) {
        int[][] first = {{1, 2, 3,}, {4, 5, 6}};
        int[][] second = {{1, 2}, {3, 4}, {5, 6}};

        final int ROW = first.length;
        final int COL = second[0].length;
        final int SECOND_ROW = second.length;

        int[][] third = new int[ROW][COL];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                for (int k = 0; k < SECOND_ROW; k++) {
                    third[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.printf("%3d", third[i][j]);
            }
            System.out.println();
        }
    }
}
