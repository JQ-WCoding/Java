package Chapter2.ch2;

public class StringEx {
    public static void main(String[] args) {
        // name이라는 문자열 변수에 "Jun" + "Q"인 JunQ로 초기화
        String name = "Jun" + "Q";
        /*
        str 문자열 변수에 name 변수의 값과 1994를 더한다.
        name 변수(앞선 변수)는 String 형식이기 때문에 1994또한 문자열로 취급되어 따로 숫자가 되는것이 아닌 name+1994가 전부 문자열이 된다
         */
        String str = name + 1994;

        System.out.println(name);
        System.out.println(7 + "...");
        System.out.println("..." + 7);
        /*
        하단의 두경우 답이 다르다
        1. 14 + "..."
        2. "..." + 7 + 7
        두가지 경우 앞선 변수형이 다르기에 값도 달라진다.
         */
        System.out.println(7 + 7 + "...");
        System.out.println("..." + 7 + 7);
    }
}

