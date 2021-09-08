package Chapter5.ch5.ArrayEx;

public class ArrayEx19 {
    public static void main(String[] args) {
        // 국영수 -> 과목별 총점 만들기
        int[][] score = {{90, 50, 100}, {80, 70, 60}, {30, 90, 20}, {100, 20, 70}, {80, 80, 90}};

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("순서 \t국어 \t영어 \t수학 \t총점 \t평균");
        System.out.println("==================================");

        for (int i = 0; i < score.length; i++) {
            int personalSum = 0;
            float personalAvg = 0.0f;

            // 각 과목별 통산 점수
            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d\t", i + 1);

            // 개인 점수 과목별 합산
            for (int j = 0; j < score[i].length; j++) {
                personalSum += score[i][j];
                System.out.printf("%5d\t", score[i][j]);
            }
            // 개인 평균
            personalAvg = personalSum / (float) score[i].length;
            System.out.printf("%5d\t%5.1f%n", personalSum, personalAvg);
        }
        System.out.println("================================");
        System.out.printf("Total:\t%3d\t%4d\t%4d%n", korTotal, engTotal, mathTotal);
    }
}
