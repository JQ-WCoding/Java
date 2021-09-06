package Chapter2.ch2;

public class SpecialCharEx {
    public static void main(String[] args) {
        // 홑따옴표를 출력하기 위한 방법
        System.out.println('\'');
        // \b 는 백스페이스 -> 123 다음 3이 지워지고 456이 출력된다
        System.out.println("abc\t123\b456");
        // new line -> 줄바꿈 / println으로 인해 출력 후 줄바꿈을 실시하고 해당 출력값인 \n으로 인해 한번 더 줄바꿈한다
        System.out.println('\n');
        // "Hello"라는 문구를 출력하고 싶을 때
        System.out.println("\"Hello\"");
    }
}
