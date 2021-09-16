package chapter9.langPackage;

public class StringEx2 {
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "aaa";
        String str3 = "aaa";
        // --------- 3 변수는 값이 모두 동일하기 때문에 같은 주소를 참조
        String str4 = "bbb";
        // 값이 다르기 때문에 새로운 메모리 영역이 할당되고 해당 값이 초기화 되어 있다
    }
}
