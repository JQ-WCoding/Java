package chapter10.format;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat1 = new DecimalFormat("#,###.##");
        DecimalFormat decimalFormat2 = new DecimalFormat("#.###E0");

        try {
            Number number = decimalFormat1.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");

            // decimalFormat1 의 형태로 파싱된 number 를 double 형으로 반환
            double dNum = number.doubleValue();
            System.out.print(dNum + " -> ");

            // decimalFormat2 의 형태로 파싱된 number 를 출력
            System.out.println(decimalFormat2.format(number));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
