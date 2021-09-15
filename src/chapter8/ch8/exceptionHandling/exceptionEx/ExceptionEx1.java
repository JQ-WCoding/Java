package chapter8.ch8.exceptionHandling.exceptionEx;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {

            } catch (Exception e) {
            }
        } catch (Exception e) {
            try {

            } catch (Exception exception) { // 변수 e 중복 -> 따라서 다른 변수명으로 표현해주어야한다
                /*
                 1depth 의 catch 문에 변수명이 이미 e 로 설정되어 있기 때문에 e 가 아닌 다른 명칭을 사용해야한다
                 해당 오류의 이미 첫번째 오류가 발생하여 그 안의 catch 실행문에서 try catch 문이 작성되어 있기
                 때문에 다른 오류명이 필요하다
                 */
            }
        }

        try {

        } catch (Exception e) {
        }
    }
}
