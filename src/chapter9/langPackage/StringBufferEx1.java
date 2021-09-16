package chapter9.langPackage;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("aaa");
        StringBuffer str2 = new StringBuffer("aaa");

        // 서로 다른 주소 참조 -> 인스턴스화를 통해 각기 다른 영역에서 참조
        // 주소값 비교하는 두가지의 경우 모두 false 반환 -> 참조하는 주소가 같지 않기 때문에
        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));

        // StringBuffer 클래스의 객체로 생성된 str1 과 str2 를 toString() 을 이용하여 String 으로 초기화
        // str1 과 str2의 값은 동일하다 -> 동일한 값은 String 의 경우 같은 주소(메모리 영역)에 초기화 되어 있다
        String s1 = str1.toString();
        String s2 = str2.toString();

        // 주소비교시 같은 곳을 참조하고 있기 때문에 -> true 반환
        System.out.println("s1.equals(s2) ? " + s1.equals(s2));

        StringBuffer stringBuffer1 = new StringBuffer(10); // 문자배열 크기가 10인 StringBuffer 객체 생성
        StringBuffer stringBuffer2 = new StringBuffer("Hello"); // 해당 인자값을 가진 StringBuffer 객체 생성
    }
}
