package chapter9.langPackage;

public class WrapperEx3 {
    public static void main(String[] args) {
        int i1 = 1;

        Integer i2 = (Integer) i1; // Integer i2 = Integer.valueOf(i1); -> int 형을 오토박싱하여 Integer 클래스 형태로 반환
        Object obj = (Object) i1; // Object obj = (Object) Integer.valueOf(i1); -> Object 또한 Integer 클래스의 상속관계이기에 int 형을 Integer 클래스 형으로 변환

        Long l1 = 1L;

        int i3 = i2 + 10; // 참조형과 기본형(Primitive type 과 Wrapper 클래스형 간에 추가적인 형을 맞춰주지 않아도 자동으로 연산 가능)
        long l2 = i2 + l1; // Long 과 Integer (참조형) Wrapper 클래스 간의 연산도 가능

        Integer i4 = new Integer(22);
        int i5 = (int) i4;

        Integer i6 = i4 + i5; // 참조형과 기본형을 연산했을때 선언한 형에 맞게 연산값을 반환

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(obj);
        System.out.println(l1);
        System.out.println(i3);
        System.out.println(l2);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
    }
}
