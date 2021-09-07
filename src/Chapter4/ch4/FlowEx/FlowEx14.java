package Chapter4.ch4.FlowEx;

public class FlowEx14 {
    public static void main(String[] args) {
        // 오잉?? 이런게 도네
        /*
        변수 두개를 모두 사용할 수 있다 하지만 해당 조건은 한개여야한다
         */
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.printf("%d \t %d%n", i, j);
        }

        // 실험용 (여러개 선언 가능) -> 조건은 , 로 추가하는 이상한 방법 불가능
        for (int i = 0, j = 0, z = 0; i < 10; i++, j--, z++) {
            System.out.printf("%d \t %d \t %d%n", i, j, z);
        }
    }
}
