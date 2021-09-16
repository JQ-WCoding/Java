package chapter9.langPackage;

import java.util.StringJoiner;

public class StringEx4 {
    public static void main(String[] args) {
        // 문자열 ,를 포함하고 있는 vehicles 변수 선언
        String vehicles = "ship,car,airplane";
        // "," 를 기분으로 vehicles 문자열을 나누어 strArr 문자열 배열에 초기화한다 -> 각각 나눠저서 초기화
        String[] strArr = vehicles.split(",");

        // String 클래스 join() 을 통해 배열 strArr 내에 "-"를 추가한다
        System.out.println(String.join("-", strArr));

        // StringJoiner 클래스를 통해 첫부분과 끝부분 구분자를 무엇으로 할지 인자값으로 지정한 객체를 생성
        StringJoiner stringJoiner = new StringJoiner("/", "[", "]");

        // 반복문을 통해 참조변수 stringJoiner 에 add() 를 이용해 배열 strArr 을 모두 추가한다
        for (String s : strArr) {
            stringJoiner.add(s);
        }

        // 참조변수 stringJoiner 를 문자열로 반환 -> toString 기본
        System.out.println(stringJoiner.toString());
    }
}
