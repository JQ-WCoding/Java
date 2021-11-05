package practice;

import java.util.ArrayList;
import java.util.Objects;

public class AntGame2 {
    public static void main( String[] args ) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add( 1 );
        ArrayList<Integer> arr2;

        System.out.println( arr );

        for (int i = 0; i < 10; i++) {
            int count = 0;
            arr2 = new ArrayList<>();
            arr2.add( 1 );
            int index = 0;

            for (int j = 0; j < arr.size(); j++) {
                if (Objects.equals( arr.get( index ), arr.get( j ) )) {
                    count++;
                } else {
                    arr2.add( count );
                    arr2.add( arr.get( j ) );
                    count = 0;

                    index = j;

                    j--;
                }
            }

            arr2.add( count );
            arr = arr2;
            System.out.println( arr );
        }
    }

}
