package Chapter7.ch7.myInterface.parserTest;

public class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "-HTML parsing");
    }
}
