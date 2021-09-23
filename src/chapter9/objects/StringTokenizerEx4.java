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

        // 구분자는 "십백천만억조" -> 십, 백, 천, 만, 억, 조  (6가지)를 구분자로 가진다 : 천만을 계산 못하는 이유
        // 구분자도 반환
        StringTokenizer stringTokenizer = new StringTokenizer(input, UNIT, true);

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            int check = NUMBER.indexOf(token);

            if (check == -1) {
                if (!"만억조".contains(token)) {
                    tempResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
                } else {
                    tempResult += num;
                    result += (tempResult != 0 ? tempResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
                    tempResult = 0;
                }
                num = 0;
            } else {
                num = check;
            }
        }
        return result + tempResult + num;
    }
}
