package Chapter4.ch4.FlowEx;

public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        
        // 일반적인 반복문
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", arr[i]);
        }
        System.out.println();
        // 0 ~ 해당 배열을 모두 출력할 경우의 간략한 반복문 표현
        for (int temp : arr) {
            System.out.printf("%d", temp);
            sum += temp;
        }
        System.out.println();
        System.out.println("Sum : " + sum);
    }
}
