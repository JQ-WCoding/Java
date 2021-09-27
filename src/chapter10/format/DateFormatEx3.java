package chapter10.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx3 {
    public static void main(String[] args) {
        // dateFormat1과 같이 입력받아
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy년 MM월 dd일");
        // dateFormat2와 같이 출력할 예정
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            // 03이 아닌 3일로 해도 같은 날짜가 출력됨
            Date date = dateFormat1.parse("2022년 11월 3일");
//            Date date = dateFormat1.parse("2022년 11월 33일"); // 30일 넘으면 이월된 월의 일로 표현된다 -> 자동으로 계산해주는 부분이 많다
            System.out.println(dateFormat2.format(date));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
