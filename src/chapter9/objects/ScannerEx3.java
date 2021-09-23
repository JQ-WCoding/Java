package chapter9.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) throws FileNotFoundException {
        // data3.txt 파일 읽어오기 -> new File()생성자를 사용하기 때문에 예외처리가 필요
        Scanner scanner = new Scanner(new File("D:\\Code\\Java\\src\\chapter9\\objects\\data3.txt"));

        // 개수
        int count = 0;
        // 전체 총합
        int total = 0;

        // scanner -> data3.txt 파일을 읽어온다 -> 다음 줄이 있으면 계속 반복문을 진행한다
        while (scanner.hasNextLine()) {
            // line -> 한줄씩 읽어들이기
            String line = scanner.nextLine();
            // scanner2는 line 을 인자값으로 한 새로운 스캐너를 인스턴스화한다. -> 해당 인자값을 읽어들인다는 의미
            // useDelimiter(',')를 사용해 구분자를 ,로 구분하는 메소드
            // ,를 구분자로 1 1 1이 존재한다
            Scanner scanner2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            // 한줄안에 int 가 있다면 계속 반복문 실행
            while (scanner2.hasNextInt()) {
                // scanner2에 존재하는 int 를 sum 에 더하여 초기화
                sum += scanner2.nextInt();
            }
            // line 은 (1,1,1), (2,2,2), (3,3,3)... 식으로 초기화된다
            System.out.println(line + " / sum : " + sum);
            // 총합은 한줄 라인의 합 sum 을 total 에 계속 더해준다.
            total += sum;
            // count 1씩 증가
            count++;
        }
        System.out.println("Line : " + count + ", Total : " + total);
    }
}
