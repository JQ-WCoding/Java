package chapter11.collections;

import java.util.Properties;

public class PropertiesEx4 {
    public static void main(String[] args) {
        // Properties 인스턴스화된 변수에 System 의 properties 값으로 초기화
        Properties properties = System.getProperties();
        // 해당 명칭을 가진 property 값 가져오기
        System.out.println("java version : " + properties.getProperty("java.version"));
        System.out.println("language : " + properties.getProperty("user.language"));

        // java.version / user.language 와 같은 표기가 되어 있는 이름이 있는지 확인
        // java.version=1.8.0_302
        // user.language=ko 이런 값이 존재한다
        properties.list(System.out);
    }
}
