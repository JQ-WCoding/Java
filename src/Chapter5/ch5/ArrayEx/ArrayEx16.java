package Chapter5.ch5.ArrayEx;

public class ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("Parameters : " + args.length);
        // 메인 문에 대한 입력 값을 표현할 수 있다 -> args는 여러 값을 수용 가능
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
