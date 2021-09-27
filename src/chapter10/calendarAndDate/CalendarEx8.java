package chapter10.calendarAndDate;

public class CalendarEx8 {
    public static void main(String[] args) {
        String date1 = "201810";
        String date2 = "202003";

        // subString()을 이용해서 연도와 월을 분리한다 -> 월로 계산하기 위해 12를 곱하여 전부 months 로 환산한다
        int month1 = Integer.parseInt(date1.substring(0, 4)) * 12 + Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0, 4)) * 12 + Integer.parseInt(date2.substring(4));

        System.out.println(date1 + " & " + date2 + " difference : " + Math.abs(month1 - month2) + " months");
    }
}
