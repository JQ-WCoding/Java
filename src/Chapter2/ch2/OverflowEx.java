package Chapter2.ch2;

public class OverflowEx {
    public static void main(String[] args) {
        /*
        char은 65535까지 최대값, short은 32767까지 최대값 표현 가능
         */
        short sMin = -2134;
        short sMax = 2135;

        char cMin = 0;
        char cMax = 33425;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short) (sMin - 1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short) (sMax + 1));
        System.out.println("cMin = " + (int) cMin);
        System.out.println("cMin-1 = " + (int) --cMin);
        System.out.println("cMax = " + (int) cMax);
        System.out.println("cMax+1 = " + (int) ++cMax);
    }
}
