package chapter9.langPackage;

public class MathEx3 {
    public static void main(String[] args) {
        // 꼭지점 2개 선언
        int x1 = 1, y1 = 1;
        int x2 = 4, y2 = 4;

        // c 면 길이 구하기
        double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // 피타고라스 방정식
        double a = c * Math.sin(Math.PI / 4); // 각이 45도 라는 가정ㅡ
//        double b = c * Math.cos(Math.PI / 4); // Math.PI / 4 는 45도..
        double b = c * Math.cos(Math.toRadians(45)); // 45도 직접 사용해서 가능

        System.out.printf("a = %f%n", a);
        System.out.printf("b = %f%n", b);
        System.out.printf("c = %f%n", c);

        System.out.printf("angle = %f rad%n", Math.atan2(a, b)); // -> 두변의 끼인각 구하는 법
        System.out.printf("angle = %f rad%n", Math.toDegrees(Math.atan2(a, b))); // -> 두변의 끼인각 실제 각도 구하는 법

        System.out.printf("24 * log10(2) = %f%n", 24 * Math.log10(2));
        System.out.printf("53 * log10(2) = %f%n", 53 * Math.log10(2));
        // log 구하는 법
    }
}
