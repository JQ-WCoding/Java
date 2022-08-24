package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Streamparrel {
    public static void main( String[] args ) {
        String[] strings = {"123", "456"};
        int count = Arrays.stream( strings )
                .map( d -> 1 )
                .reduce( 0, Integer::sum );

        List<Object> list1 = Arrays.asList( 1, 2, 3 );
        List<Object> list2 = Arrays.asList( 2, 3, 4 );

        boolean equals = Objects.equals( list1, list2 );
        System.out.println( equals );
    }
}
