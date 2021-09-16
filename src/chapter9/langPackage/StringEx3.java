package chapter9.langPackage;

public class StringEx3 {
    public static void main(String[] args) {
        // 크기가 0인 배열
        char[] arr = new char[0];
        String str = new String(arr);

        // 둘다 빈칸
        System.out.println(arr);
        System.out.println(str);

        System.out.println("arr.length = " + arr.length);
        System.out.println("!!!" + str + "!!!"); // 중간에 띄어쓰기 혹은 아무 문자열도 출력되지 않고 !가 계속 열거되는 것을 확인

        String hi = "Hellollo";
        String rHi = hi.replace("ll", "LL");
        System.out.println(rHi);

        String aaa = "AABBAABB";
        String rAaa = aaa.replaceAll("BB", "bb");
        System.out.println(rAaa);

        /*
        replace 와 replaceAll 의 차이점 :
        replace(CharSequence old, CharSequence nw) -> replace 는 오로지 문자열만 인자값으로 받을 수 있게 만들어진 반면
        replaceAll(String regex, String replacement) -> replaceAll 은 문자열 뿐만 아니라 정규식도 인자값으로 받을 수 있다
        따라서, replaceAll 을 통해 정규식을 사용하여 특징을 가진 문자열들도 변환시킬 수 있는 다양한 활용성이 있음
        replace("[aba]", "t") 이런식으로 사용할 수 없음 / replaceAll("[aba]", "t") 이런식으로 사용 가능


        출처 : https://djusti.tistory.com/8
         */
    }
}
