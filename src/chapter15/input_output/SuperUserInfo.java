package chapter15.input_output;

public class SuperUserInfo {
    String name;
    String password;

    public SuperUserInfo() {
        this( "Unknown", "1111" );
    }

    public SuperUserInfo( String name, String password ) {
        this.name = name;
        this.password = password;
    }
}
