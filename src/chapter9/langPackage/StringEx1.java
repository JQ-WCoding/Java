package chapter9.langPackage;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "aaa";

        // 이렇게 선언했다
        System.out.println("String str1 = \"aaa\" ");
        System.out.println("String str2 = \"aaa\" ");
        System.out.println();

        // 두 문장 모두 주소가 같은가?를 물어보는 답안
        System.out.println("str1 == str2 ? " + (str1 == str2));
        // 값이 같은가 물어보는 메소드 equals -> 이유는 String 의 경우에는 주소가 아닌 값으로 판단한다고 저번에 작성했었음
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();

        /*
         같은 bbb 값을 2개 각기 다른 변수에 초기화
         StringPool 의 특징으로 같은 값은 한 주소만 할당하여 같이 참조하도록 하지만, new String 을 통해 새 객체를 각각 생성하였기 때문에 같은 값이지만 다른 주소를 참조한다
         */
        String str3 = new String("bbb");
        String str4 = new String("bbb");

        System.out.println("String str3 = new String(\"bbb\") ");
        System.out.println("String str4 = new String(\"bbb\") ");
        System.out.println();

        // 참조하는 주소가 같은가? -> 참조하는 주소는 다르다
        System.out.println("str3 == str4 ? " + (str3 == str4));
        // 값은 같은가? -> 참조하는 주소는 다르지만 값은 동일
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));
    }
}
