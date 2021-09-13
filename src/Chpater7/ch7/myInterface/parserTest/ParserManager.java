package Chpater7.ch7.myInterface.parserTest;

public class ParserManager {
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return (Parseable) new XMLParser(); // (Parseable) 이 생략되어 있을 것 -> 부모의 형태로 형변환 하기에 생략 가능
        }
        // 매개변수로 받은 type이 XML 인지 HTML인지에 반환되는 인터페이스 형태가 다르다
        else {
            // if문 과 같이 줄여서 반환도 가능
            Parseable parseable = new HTMLParser();
            return parseable;
        }
    }
}
