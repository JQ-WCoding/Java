package chapter10.format;

import java.text.DecimalFormat;

public class DecimalFormatEx1 {
    public static void main(String[] args) throws Exception {
        double num = 1234567.89;
        // 정규식과 같은 decimal 수 표현식
        String[] patterns = {
                "0",
                "#",
                "0.0",
                "#.#",
                // 0의 자리수만큼 없는 값이 없는 자리도 표현됨
                "000000000.0000",
                // #은 없는 값의 자리는 표현되지 않음 -> 최대 표현의 범위만 적용된다
                "#########.####",
                "#.#-",
                "-#.#",
                "#, ###.##",
                "#, ####.##",
                // 진수표현
                "#E0",
                "0E0",
                "##E0",
                "00E0",
                "####E0",
                "000E0",
                "#.#E0",
                "0.0E0",
                "0.00000000E0",
                "00.0000000E0",
                "000.000000E0",
                "#.########E0",
                "##.#######E0",
                "###.######E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                // \u2030 은 1000분의 1 %표현으로 변환
                "#.#\u2030",
                // \u00A4 는 원화단위로 변환 -> 숫자 3칸마다 한번씩 , 작성
                // 정확히는 해당 지역의 원환 환산으로 바꿔주는 형식
                "\u00A4 #,###",
                "'#'#,###",
                "''#,###", // 더 사용하지 않아도 통일성이 생긴 기분
        };

        for (String str : patterns) {
            // str pattern 에서 각 인덱스별 값에 의해 선언된 decimalFormat 에서 number 변수를 다양한 format 에 맞게 출력
            DecimalFormat decimalFormat = new DecimalFormat(str);
            System.out.printf("%19s : %s\n", str, decimalFormat.format(num));
        }
    }
}
