package Chapter6.ch6.param;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};

        print(arr);
        sort(arr);
        print(arr);

        System.out.println("sum : " + sum(arr));
    }

    /**
     * 배열 출력
     *
     * @param arr
     */
    static void print(int[] arr) {
        System.out.print("[");

        // 모든 구성요소 출력
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("]");
    }

    /**
     * 배열 합 구하기
     *
     * @param arr
     * @return sum
     */
    static int sum(int[] arr) {
        // 반환 타입이 정수형인 sum 메소드로 매개변수 arr 배열의 모든 값을 더한 결과를 반환한다
        int sum = 0;

        // 값 전부 더하는 반복문 (간략화)
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    /**
     * 배열 오름차순 정렬하기
     *
     * @param arr
     */
    static void sort(int[] arr) {
        // arr.length == 6
        // 배열 arr의 길이-1만큼 실행 -> 전체 확인 같은 느낌 (0 ~ 5) 처음부터 끝까지 확인
        for (int i = 0; i < arr.length - 1; i++) {
            /*
            5-i -> 1차반복문이 한번 전체실행되고 돌아올때마다 5, 4, 3,...순으로 줄어듬
            (0~5) (1~4) (2~3) ...(이후는 초과값이라 반복문 사용 x)
            배열 (arr의 길이-1-i) 인 이유 : 가장 처음과 가장 마지막은 중간 해당 계산 중 min ~ max 을 담당한다 중간의 비교값들은 아직 뒤섞여있지만 처음과 끝은
            2차 반복문 종료시 정렬됨으로 양끝 두 범위를 줄이면서 진행해도 상관없기 때문에
             */
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 위치 변환과정 -> 오름차순이기에 왼쪽부터 작은 수 이어야한다. 즉, 이전의 배열값이 더 큰경우 임의의 변수 temp를 통해 두자리의 값을 변경
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
