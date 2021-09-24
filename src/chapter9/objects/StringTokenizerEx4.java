package chapter9.objects;

import java.util.StringTokenizer;

public class StringTokenizerEx4 {
    public static void main(String[] args) {
        String input = "십억삼만이천팔백칠십구";
        System.out.println(input);
        System.out.println(koreanToNumber(input));
    }

    static long koreanToNumber(String input) {
        long result = 0;
        long tempResult = 0;
        long num = 0;

        final String NUMBER = "영일이삼사오육칠팔구";
        // 천만, 백만 단위를 계산하지 못함
        final String UNIT = "십백천만억조";
        // 억까진 가능, 조는 int 범위를 벗어나 표현을 int 형이 아닌 1e12로 뒤의 0이 몇개인지 표현해야한다
        final long[] UNIT_NUM = {10, 100, 1_000, 10_000, 100_000_000, (long) 1e12};

        // 구분자는 "십백천만억조" -> 십, 백, 천, 만, 억, 조  (6가지)를 구분자로 가진다
        // 구분자도 반환
        StringTokenizer stringTokenizer = new StringTokenizer(input, UNIT, true);

        // 토큰을 가지고 있을 경우 계속 반복
        // num 값은 초기 1회를 제회하고 초기화된 값으로 진행
        while (stringTokenizer.hasMoreTokens()) {
            // 하나씩 읽어들이는 과정
            String token = stringTokenizer.nextToken();
            // check 에는 NUMBER 의 값에 포함되는지 확인하여 해당 인덱스 혹은 -1을 반환
            // indexOf() 포함이 안되어 있는 경우 -> -1을 반환
            int check = NUMBER.indexOf(token);

            // NUMBER (숫자)가 아닌경우 UNIT 임을 판단하기 위
            if (check == -1) {
                // 직관적으로 표현하기 위해 조건문 수정
                if ("만억조".contains(token)) { // 만억조
                    tempResult += num;
                    result += (tempResult != 0 ? tempResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
                    tempResult = 0;
                } else { // 십백천
                    tempResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
                }
                // 단위이긴 하나 UNIT 을 포함하고 있지 않은 경우 num 을 0으로 초기화
                num = 0;
            } else {
                // 숫자인 경우 check 값을 그대로 num 에 초기화
                num = check;
            }
        } // while
        // 반복문이 종료되면 (result + tempResult + num) 모두 더해서 반환
        return result + tempResult + num;
    }
}
