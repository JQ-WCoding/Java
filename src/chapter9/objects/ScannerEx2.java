package chapter9.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        // 절대 경로로 전부 작성하였음
        // '\'를 표시하기 위해서는 \\로 작성해야한다
        Scanner scanner = new Scanner(new File("D:\\Code\\Java\\src\\chapter9\\objects\\data2.txt"));
        // 합
        int sum = 0;
        // 총 개수
        int count = 0;

        // 숫자가 있는 순간까지 계속 반복문 유지
        while (scanner.hasNextInt()) {
            // 숫자가 있을 경우 sum 에 계속 더해서 총합 구하기
            sum += scanner.nextInt();
            // 개수 증가
            count++;
        }

        System.out.println("sum : " + sum);
        System.out.println("average : " + (double) sum / count);
    }
}
