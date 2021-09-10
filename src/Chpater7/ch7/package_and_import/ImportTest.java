package Chpater7.ch7.package_and_import;

import java.text.SimpleDateFormat; // java text 패키지 내의 SimpleDateFormat 클래스 추출
import java.util.Date; // java util 패키지 내의 Date 클래스 추출
// 위와 같이 표현하지 않으면 객체를 선언할때 java.util.Date date = new java.util.Date();와 같이 사용해야한다
// 편리성을 증가 시킬 수 있는 방법

public class ImportTest {
    public static void main(String[] args) {
        // java.util.Date를 통해 패키지를 import 하였기 때문에 Date 클래스를 인스턴스화 하여 사용할 수 있다
        Date date = new Date();

        // SimpleDateFormat은 특정 문자열을 인자값으로 지정하여 원하는 형식의 날짜로 맞출 수 있도록 설정하는 방법
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd"); // 연도 / 달 / 일
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a"); // 시간/분/초 오전오후

        /*
         각각의 SimpleDateFormat 클래스를 인스턴스화 하여 참조변수 dateFormat과 timeFormat의 format 메소드의 인자값 date를 통해
         오늘의 날짜를 상단에 선언한 형식에 맞게 출력하는 방법
         */
        System.out.println("Date : " + dateFormat.format(date));
        System.out.println("Time : " + timeFormat.format(date));
    }
}
