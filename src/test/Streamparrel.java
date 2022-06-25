package test;

import java.util.Arrays;

public class Streamparrel {
    public static void main(String[] args) {
        String[] strings = {"123", "456"};
        int count = Arrays.stream( strings )
                .map( d -> 1 )
                .reduce( 0, Integer::sum );
    }
}
