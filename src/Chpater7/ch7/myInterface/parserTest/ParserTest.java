package Chpater7.ch7.myInterface.parserTest;

public class ParserTest {
    public static void main(String[] args) {
        // Parseable 을 인스턴스화한 parseable 은 ParserManger.getParser() 메소드의 반환형 Parseable 을 통해 값을 가진다
        // Parseable parseable = new XMLParser(); 의 실행결과와 동일 -> 이건 Parseable 인걸까 XMLParser 인걸까
        Parseable parseable = ParserManager.getParser("XML"); // equals() 사용해서 String 값이 동일한지 확인해서 반환값 다르게 준다.
        parseable.parse("hi"); //-> 인테페이스를 인스턴스화한 경우인데 parse() 가 어떻게 실행될까?

        parseable = ParserManager.getParser("HTML");
        // xml 을 제외한 모든 값은 html 출력문이 나온다 -> else 구문으로 처리 되어 있음
        parseable.parse("bye");
    }
}
