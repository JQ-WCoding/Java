package test.thisIsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {
    public static void main(String[] args) {
        byte byteValue = 10;
        float floatValue = 2.5F;
        double doubleValue = 2.5;

        // Compile Error -> 수식을 int 형으로 변환하여 계산하기 때문에 이후 다시 byte로 형변환을 해주거나 아니면 int 형으로 result를 선언해주어야한다
        //        byte result = byteValue + byteValue;

        int result1 = 5 + byteValue;
        float result2 = 5 + floatValue;
        double result3 = 5 + doubleValue;

        List<Object> results = new ArrayList<>( Arrays.asList( result1, result2, result3 ) );

        // 반환형태가 list이기 때문에 new ArrayList<>()를 통해 새로 선언할 이유가 크게 없음 선언타입이 ArrayList이면 모르겠지만 실 구현체를 타입으로 선언하기 쉽지 않음
        List<Object> results2 = Arrays.asList( result1, result2, result3 );

        List<Object> results3 = new ArrayList() {{
            add( result1 );
            add( result2 );
            add( result3 );
        }};

        results.forEach( System.out::println );
        results2.forEach( System.out::println );
        results3.forEach( System.out::println );
    }
}
