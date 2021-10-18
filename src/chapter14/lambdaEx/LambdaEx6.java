package chapter14.lambdaEx;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class LambdaEx6 {
    public static void main( String[] args ) {
        // 예제 5와 같은 내용의 함수 정의
        IntSupplier is = ( ) -> (int) ( Math.random() * 100 ) + 1;
        IntConsumer ic = i -> System.out.print( i + ", " );
        IntPredicate ip = i -> i % 2 == 0;
        IntUnaryOperator iuo = i -> i / 10 * 10;

        int[] arr = new int[10];

        makeRandomList( is, arr );
        System.out.println( Arrays.toString( arr ) );
        printEvenNum( ip, ic, arr );
        int[] newArr = doSomething( iuo, arr );
        System.out.println( Arrays.toString( newArr ) );
    }

    // 기본형 int 를 사용하여 정의가능 -> IntSupplier, IntPredicate 와 같은 반환 타입이 int 형
    static void makeRandomList( IntSupplier is, int[] arr ) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = is.getAsInt();
        }
    }

    static void printEvenNum( IntPredicate ip, IntConsumer ic, int[] arr ) {
        System.out.print( "[" );
        for (int i : arr) {
            if (ip.test( i )) {
                ic.accept( i );
            }
        }
        System.out.println( "]" );
    }

    static int[] doSomething( IntUnaryOperator iuo, int[] arr ) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = iuo.applyAsInt( arr[i] );
        }

        return newArr;
    }
}
