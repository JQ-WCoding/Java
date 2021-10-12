package chapter11.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesEx2 {
    public static void main(String[] args) {
        // arguments 로 바로 실행
        if (args.length != 1) { // 입력 값이 없으면 출력 후 종료
            System.out.println("Usage : java PropertiesEx2 INPUT FILE NAME");
            System.exit(0);
        }

        Properties properties = new Properties();
        // inputFile 파일명 가져오기
        // 절대 경로로 설정
        // arguments 로 input.txt 만 값을 받고 나머지는 절대 경로를 미리 설정하여 collections 파일내에 존재할 경우 찾을 수 있다
        String inputFile = "D:\\Code\\Java\\src\\chapter11\\collections\\" + args[0];

        try {
            // properties 에 파일 값으로 초기화
            properties.load(new FileInputStream(inputFile));
        } catch (IOException ioe) { // 해당 파일이 없을 경우 -> 예외사항
            System.out.println("Cannot find the file");
            // 종료
            System.exit(0);
        }

        // property 명 -> 명칭 사용
        // name 은 문자열로 초기화
        String name = properties.getProperty("name");
        /*
        try {
            name = new String(name.getBytes("8859_1"), "EUC-KR");
        } catch (Exception e) {
            System.out.println("Encoding error");
        }
        한글로 입력 받은 경우 인코딩을 위해 -> OS의 기본 인코딩이 유니코드가 아니어서 변환이 필요하다는 것만 인지하기
        */

        // data 문자열을 확인하면 해당 문자열을 ","를 구분자로 문자배열 생성
        String[] data = properties.getProperty("data").split(",");

        // 최대, 최소, 합 값 초기화
        int max = 0, min = 0, sum = 0;
        // 값 선언
        int value;
        for (int i = 0; i < data.length; i++) {
            value = Integer.parseInt(data[i]); // 문자배열 data 의 각 요소 값마다 초기화

            if (i == 0) {
                // 첫번째 값인 경우 최대, 최소, 값 모두 value 변수의 값으로 초기화
                max = min = value;
            }
            // 최대 최소 값 지정
            if (max < value) {
                max = value;
            } else if (min > value) {
                min = value;
            }
            // 총합을 위한 값 더하기
            sum += value;
        }

        System.out.println("name : " + name);
        System.out.println("max : " + max);
        System.out.println("min : " + min);
        System.out.println("sum : " + sum);
        System.out.println("avg" + (sum * 100.0 / data.length) / 100);
    }
}
