package Chapter5.ch5.ArrayEx;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        // char형의 출력이기에 해당 값이 나열되어 정상 출력될 것
        System.out.println(abc);
        System.out.println(num);

        // abc와 num의 길이를 합한 새로운 배열 선언
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length); // abc[0]부터 abc.length 길이만큼 result[0]에 순차적으로 초기화
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // abc[0]부터 num[0]까지 abc.length 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
