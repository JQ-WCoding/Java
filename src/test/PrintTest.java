package test;

import java.util.ArrayList;
import java.util.List;

public class PrintTest {
    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();

        testList.add( "1" );
        testList.add( "" );
        testList.add( "3" );

        testList.forEach( System.out::println );
    }
}
