package chapter10.format;

import Chapter7.ch7.myInterface.interfaceTest2.C;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);

        Scanner scanner = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜는 " + pattern + "의 형태로 입력 ::: ");

        // 입력받은 라인에 값이 있으면
        while (scanner.hasNextLine()) {
            try {
                // inDate 에 dateFormat 형식으로 입력받은 값을 초기화한 후 바로 break 문을 만나 탈출
                inDate = dateFormat.parse(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("날짜는 " + pattern + "의 형태로 입력 ::: ");
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inDate);
        Calendar today = Calendar.getInstance();
        // 분 시간 -> 최종 시간으로 계산
        long diffTime = (calendar.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
        // 날도 추가로 계산해보기
        long diffDay = (calendar.getTimeInMillis() - today.getTimeInMillis()) / (24 * 60 * 60 * 1000);

        System.out.println("입력한 날짜와 현재 날짜는 " + diffTime + "시간의 시간차가 있습니다");
        System.out.println("일로는 " + diffDay + "일의 시간차가 있습니다.");
    }
}
