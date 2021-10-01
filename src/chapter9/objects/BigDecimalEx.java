package chapter9.objects;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalEx {
    public static void main(String[] args) {
        // 1, 2 선언
        BigDecimal bigDecimal1 = new BigDecimal("1234.5678");
        BigDecimal bigDecimal2 = new BigDecimal("1.0");

        /*
        unscaledValue()는 scale()을 적용하기 이전의 값이다
        scale()은 소수점 자리 수 (자리 크기)와 같은 의미
        precision()은 총 몇개의 숫자가 존재하는지 자리 수
         */
        // bigDecimal1 출력문
        System.out.print("BD1 : " + bigDecimal1);
        System.out.print(", \tvalue : " + bigDecimal1.unscaledValue());
        System.out.print(", \tscale : " + bigDecimal1.scale());
        System.out.print(", \tprecision : " + bigDecimal1.precision());
        System.out.println();

        // bigDecimal2 출력문
        System.out.print("BD2 : " + bigDecimal2);
        System.out.print(", \tvalue : " + bigDecimal2.unscaledValue());
        System.out.print(", \tscale : " + bigDecimal2.scale());
        System.out.print(", \tprecision : " + bigDecimal2.precision());
        System.out.println();

        // BD1 * BD2 의 값
        BigDecimal bigDecimal3 = bigDecimal1.multiply(bigDecimal2);
        System.out.print("BD3 : " + bigDecimal3);
        System.out.print(", \tvalue : " + bigDecimal3.unscaledValue());
        System.out.print(", \tscale : " + bigDecimal3.scale());
        System.out.print(", \tprecision : " + bigDecimal3.precision());
        System.out.println();

        // BD1 과 BD2를 나눌때 스케일 2를 주고, 반올림(6이상부터)하기러 한다
        // 다시 한번 보기
        System.out.println(bigDecimal1.divide(bigDecimal2, 2, RoundingMode.HALF_UP));
        System.out.println(bigDecimal1.setScale(2, RoundingMode.HALF_UP));

        System.out.println(bigDecimal1.divide(bigDecimal2, new MathContext(3, RoundingMode.HALF_UP)));

        // 자리수 설정 -> MathContext() 생성자를 통해 자릿수 2, 6이상인경우 반올림하는 정보를 담은 객체를 생성한다
        System.out.println(new MathContext(2, RoundingMode.HALF_UP));
    }
}
