package chapter11.collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx3 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // properties 변수에 해당 값 저장
        properties.setProperty("timeout", "10");
        properties.setProperty("language", "Eng");
        properties.setProperty("size", "5");
        properties.setProperty("capacity", "5");

        String path = "D:\\Code\\Java\\src\\chapter11\\collections\\";
        try {
            // output.txt 와 output.xml 형식으로 파일을 만들어 저장
            // 위치를 변경하고 싶어짐
            // path 변수를 사용해 절대 경로를 지정하고 해당 package 내에 저장할 수 있도록 경로 설정
            // 두번째 인자값을 통해 -> comment(간단한 주석과 같은 느낌) 남길 수 있다
            properties.store(new FileOutputStream(path + "output.txt"), "Properties Example");
            properties.storeToXML(new FileOutputStream(path + "output.xml"), "Properties Example");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
