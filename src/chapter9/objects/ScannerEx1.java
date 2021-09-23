package chapter9.objects;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String[] strArr; 이거랑 차이가 있나? -> 기본 "" = null 인데
        // 결론 : 차이가 없으니 그냥 선언만 해도 됨
//        String[] strArr = null;
        String[] strArr;

        // 무한 반복문
        while (true) {
//            String prompt = ">>";
            // 입력 표시용
            System.out.print(">>");

            // 한줄 입력
            String input = scanner.nextLine();
            String scan = scanner.next();
            // 입력값 앞뒤 공백제거 -> '   abc bc a   ' 이런식으로 입력 받았다면 -> 'abc bc a'와 같이 입력받아 지도록 trim()을 사용
            input = input.trim();
            /*
             strArr 에 입력받은 input 변수를 " "(공백)을 정규식으로 분리하여 각각 배열로 초기화
             " " 와 " +" 차이는 ?
             " " -> 단순 한번의 공백 / " +" -> 공백이 한번 이상 일치된다
             즉 +을 이용해 한번이상의 패턴이 나올 수 있음을 표시 가능
             */
            strArr = input.split(" +");

            // 문자열 첫번째 시작부분 -> 공백제거 후 결과값 초기화
            String command = strArr[0].trim();

            // 입력받은 것이 없는 경우 -> null 인 경우 continue 를 통해 다시 상단으로 올라간다
            if ("".equals(command)) continue;

            // 첫 문자열 대문자인 경우를 고려하여 소문자로 변경한다 -> Q 를 입력해도 종료시키려고 그런거 같다
            command = command.toLowerCase();

            // q 를 입력받으면 종료
            if (command.equals("q")) {
                // 종료시 System.exit 에 인자값 0을 통해 종료가능
                //  Runtime.getRuntime().exit(status);
                System.exit(0);
            } else {
                for (String str : strArr) {
                    System.out.println(str);
                }
            }
        }
    }
}
