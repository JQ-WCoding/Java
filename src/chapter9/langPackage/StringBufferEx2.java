package chapter9.langPackage;

public class StringBufferEx2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("12");
        //   append()내부의 super.append(i)로 인하여 StringBuffer AbstractStringBuilder 를 상속받고 있는 변수에 계속해서 값을 초기화 한다
        // 따라서, sb2의 값만 sb1.append(34)로 초기화 되는게 아니라 sb1 또한 값이 초기화된다
        StringBuffer sb2 = sb1.append(34);
        sb1.append("5").append(67);
        // 계속해서 append() 실행하고 실행마다 super.append() 로 인해 부모클래스에 값이 초기화됨
        StringBuffer sb3 = sb1.append(89);
        sb3.append(9.0);

        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);

        System.out.println("sb1 = " + sb1.deleteCharAt(10)); // 10번째 인덱스는 '.' 이다
        System.out.println("sb1 = " + sb1.delete(3, 6)); // 인덱스 3부터 ~ 5까지 (6미만)
        System.out.println("sb1 = " + sb1.insert(6, "abc"));
        System.out.println("sb1 = " + sb1.replace(3, sb1.length(), "MIDDLE"));

        System.out.println("capacity = " + sb1.capacity()); // 버퍼의 크기를 반환
        System.out.println("length = " + sb1.length()); // 길이
        /*
         data의 thread-safe 를 하기 위해 자바에서는 synchronized 키워드를 제공해 스레드간 동기화를 시켜 data의 thread-safe를 가능케합니다.
         출처: https://coding-start.tistory.com/68 [코딩스타트]
         */
    }
}
