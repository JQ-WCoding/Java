package chapter9.langPackage;

public class StringEx6 {
    public static void main(String[] args) {
        int iValue = 100;
        String strValue1 = String.valueOf(iValue);

        double dValue = 100.0;
        String strValue2 = dValue + "";

        // 앞의 "+" 는 부호 -> 부호와 소숫점'.' 과 같은 경우는 인자값으로 함께 사용 가능하다
        double sum1 = Integer.parseInt("+" + strValue1) + Double.parseDouble(strValue2);

        // 상단과 동일하는 통일성을 위한 메소드명 valueOf() 사용 -> 결국 parseInt()와 parseDouble()을 호출하기 때문에 결과값은 동일하다
        double sum2 = Integer.valueOf(strValue1) + Double.valueOf(strValue2);

        // 두 표현 방식은 동일하나 간편화게 하단의 방법도 많이 사용된다
        System.out.println(String.join("", strValue1, " + ", strValue2, " = ") + sum1);
        System.out.println(strValue1 + " + " + strValue2 + " = " + sum2);
    }
}
