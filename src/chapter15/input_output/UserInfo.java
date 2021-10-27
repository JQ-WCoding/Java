package chapter15.input_output;

import java.io.Serializable;

public class UserInfo implements Serializable {
    // 모두 직렬화 될 변수
    String name;
    String password;
    int age;

    // 기본생성자 -> 아무것도 파라미터로 입력값을 주지 않는다면 기본값이 저장된다
    public UserInfo() {
        this( "Unknown", "1111", 0 );
    }

    // 생성자
    public UserInfo( String name, String password, int age ) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
