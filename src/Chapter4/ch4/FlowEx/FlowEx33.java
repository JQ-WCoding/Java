package Chapter4.ch4.FlowEx;

public class FlowEx33 {
    public static void main(String[] args) {
        // 반복문에 이름을 지정해서 자유롭게 break 설정
        Loop1:
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5)
                    break Loop1;
//                break;
//                continue Loop1;
//                continue;
                // -> 위의 각각 사항마다 Loop1에 이름을 붙여줬기에 내부 반복문을 종료하거나 외부를 종료하거나 자유롭게 설정 가능하다
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
