package Chapter5.ch5.ArrayEx;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // 배열에 값 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Before");
        System.out.println("arr.length : " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        // arr 배열의 2배 길이 배열 선언
        int[] temp = new int[arr.length * 2];

        // 해당 길이만큼 대입한후 남은 5 ~ 9까지의 부분은 선언과 함께 초기화된 값인 0으로 유지
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;

        System.out.println("After");
        System.out.println("arr.length : " + arr.length);
        // 새로 정의된 arr 배열 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
