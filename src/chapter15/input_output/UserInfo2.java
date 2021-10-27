package chapter15.input_output;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UserInfo2 extends SuperUserInfo implements Serializable {
    int age;

    public UserInfo2() {
        this( "Unknown", "1111", 0 );
    }

    public UserInfo2( String name, String password, int age ) {
        super( name, password );
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo2{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    // 오브젝트 값 입력
    private void writeObject( ObjectOutputStream oos ) throws IOException {
        oos.writeUTF( name );
        oos.writeUTF( password );
        oos.defaultWriteObject();
    }

    // 값 읽어들이기
    private void readObject( ObjectInputStream ois ) throws IOException, ClassNotFoundException {
        name = ois.readUTF();
        password = ois.readUTF();
        ois.defaultReadObject();
    }
}
