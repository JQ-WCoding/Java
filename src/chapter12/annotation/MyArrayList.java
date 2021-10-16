package chapter12.annotation;

import java.util.Arrays;

public class MyArrayList<T> {
    T[] arr;

    // -Xlint 옵션을 붙여서 컴파일할 때, 경고가 발생 방지
    @SafeVarargs
    @SuppressWarnings ( "varargs" )
    MyArrayList(T... arr) {
        this.arr = arr;
    }

    @SafeVarargs
    public static <T> MyArrayList<T> asList(T... a) {
        return new MyArrayList<>( a );
    }

    @Override
    public String toString() {
        return Arrays.toString( arr );
    }
}
