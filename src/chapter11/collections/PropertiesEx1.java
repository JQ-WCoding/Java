package chapter11.collections;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // Properties 는 (String, String)형태로 단순하게 저장
        // HashMap 과 같이 (Object, Object)로 복합적인 저장은 불가능
        properties.setProperty("timeout", "30");
        properties.setProperty("language", "Korean");
        properties.setProperty("size", "5");
        properties.setProperty("capacity", "5");

        // Enumeration 인터페이슬 사용 -> 이름만 가져온다
        Enumeration enumeration = properties.propertyNames();

        String element;
        while (enumeration.hasMoreElements()) {
            element = (String) enumeration.nextElement();
            System.out.println(element + " : " + properties.getProperty(element));
        }
        System.out.println();

        properties.setProperty("size", "30");
        System.out.println("size : " + properties.getProperty("size"));
        // defaultValue 인 인자값은 값이 없다면 30으로 출력하지만, 값이 있다면 해당 저장된 값을 출력하는 getProperty()메소드
        System.out.println("capacity : " + properties.getProperty("capacity", "30"));
        System.out.println("loadFactor : " + properties.getProperty("loadFactor", "0.5"));

        System.out.println(properties);
        // (PrintStream out) -> -- listing properties -- 를 출력 이후
        // 해당 요소를 key value 순으로 출력한다
        // out.println(key + "=" + val);
        properties.list(System.out);
    }
}
