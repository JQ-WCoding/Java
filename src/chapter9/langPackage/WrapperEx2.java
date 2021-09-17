package chapter9.langPackage;

public class WrapperEx2 {
    public static void main(String[] args) {
        int i1 = new Integer("100").intValue();
        int i2 = Integer.parseInt("200");
        Integer i3 = Integer.valueOf("300");
        int i4 = Integer.parseInt("100", 2);
        int i5 = Integer.parseInt("100", 8);
        int i6 = Integer.parseInt("100", 16);
        int i7 = Integer.parseInt("FF", 16);
        // 인자값으로 ""의 문자열과 radix 진수의 형태를 같이 전달하면 해당 진수로 표현하였을때 같은 수로 전환해서 반환
//        int i8 = Integer.parseInt("FF"); -> 진법 생략시 10진법으로 간주하여 FF 문자는 숫자로 변환되지 않는다

        // parseInt()와 valueOf()의 값이 다르게 출력되는지 확인하기 위해
        // 하단의 형태가 int 가 아닌 Integer 인 이유는 valeOf()의 반환형이 Wrapper 클래스 형이기 때문이다 (primitive type 으로 반환되지 않는다) -> 속도가 조금 더 느림
        Integer i9 = Integer.valueOf("100", 2);
        Integer i10 = Integer.valueOf("100", 8);
        Integer i11 = Integer.valueOf("100", 16);
        Integer i12 = Integer.valueOf("FF", 16);

        // 출력문
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println();
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);
        System.out.println();
        System.out.println(i9);
        System.out.println(i10);
        System.out.println(i11);
        System.out.println(i12);
    }
}
