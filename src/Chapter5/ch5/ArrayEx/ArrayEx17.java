package Chapter5.ch5.ArrayEx;

public class ArrayEx17 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("usage : java ArrayEx17 NUM1 Operate NUM2"); // Operate 인거 같은 기분
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char operate = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (operate) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Not supported");
        }
        System.out.println("Result : " + result);
    }
}
