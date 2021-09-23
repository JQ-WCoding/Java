package chapter9.objects;

import java.util.Random;

public class RandomEx2 {
    public static void main(String[] args) {
        // random -> 인자값 없이 보내면 seed 값을 현재 시간으로 설정
        Random random = new Random();

        int[] num = new int[100];
        int[] count = new int[10];

        // 100개 값 초기화
        for (int i = 0; i < num.length; i++) {
            // nextInt() 인자값은 해당 난수의 범위를 지정해준다
            System.out.print(num[i] = random.nextInt(10));
        }
        System.out.println();

        // 해당 숫자 자리수마다 추가하기
        // 0 이면 count[0]에 +1 과 같이 구현
        for (int i : num) {
            count[i]++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "의 개수 : " + print('#', count[i]) + " " + count[i]);
        }
    }

    static String print(char ch, int val) {
        // 매개변수로 받은 val 의 길이만큼 문자를 출력하기 위한 함수
        // 문자 배열 check 에 val 크기만큼 초기화
        char[] check = new char[val];

        // 반복문 동안 동일한 문자를 check 배열에 입력
        for (int i = 0; i < check.length; i++) {
            check[i] = ch;
        }

        // 초기화된 문자 배열을 문자열로 변환하여 반환
        return new String(check);
    }
}
