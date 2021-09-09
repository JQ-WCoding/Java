package Chapter6.ch6.overloading;

public class VarArgsEx {
    public static void main(String[] args) {
        // 가변인자
        String[] arr = {"1", "2", "3"};

        System.out.println(sample(' ', "1", "2", "3"));
        System.out.println(sample('-', "1", "2", "3"));
        System.out.println(sample(',', "1", "2", "3"));
        System.out.println(sample(new String[0])); // -> null이기 때문에 값이 출력되지 않음
        System.out.println(sample(',')); // 이 경우 -> args가 없음으로 반복문이 돌지 않는다. 따라서 아무것도 출력되지 않는다
    }

    // concatenate : link together in chain
    // 아래의 메소드도 사용하기 위해 상단의 sample 메소드의 매개변수 ex을 형태를 String 에서 char로 변경
    static String sample(char ex, String... args) {
        // Builder 와 append()를 사용한 String 잇는 것이 더욱 좋다
        // 같은 주소에 값만 수정되는 개념 -> String을 직접 수정하는 경우 계속해서 새로운 메모리를 할당해 낭비가 생긴다(?)
        StringBuilder result = new StringBuilder();

        for (String str : args) {
            result.append(str).append(ex);
        }

        return result.toString(); // 반환 형태가 String임으로 .toString() 메소드를 이용해 String형으로 반환
    }

    /*
     가변인자만 받을 경우 String ex에 해당하는 변수 값은 기본값으로 설정하여 "" 혹은 "-" 등으로 만들어 사용할 수 있나?
     -> 해당의 경우 중복으로 메소드를 호출하는 오류 발생
     */
    static String sample(String... args) {
        return sample('-', args);
    }

}
