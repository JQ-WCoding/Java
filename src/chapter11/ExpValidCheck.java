package chapter11;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            // () 사용 표현식에 적합성 확인
            System.out.println("Usage : java ExpValidCheck \"Expression\"");
            System.out.println("Example : java ExpValidCheck \"((2+3) * 1) + 3\"");
            System.exit(0);
        }
        // arguments 로 (5+7)/2 작성하여 실행해봄


        Stack stack = new Stack();

        // argument 로 받아온 첫번째 입력 값
        String expression = args[0];

        System.out.println("expression : " + expression);

        try {
            // 반복문 외부에 선언해두는 것이 더 효과적
            char ch;
            for (int i = 0; i < expression.length(); i++) {
                // 입력받은 값을 각각 문자마다 초기화하여 비교하기
                ch = expression.charAt(i);

                if (ch == '(') { // 열린 괄호를 만날경우 해당 값을 stack 에 저장해둔다
                    stack.push(ch + "");
                } else if (ch == ')') { // 닫힌 괄호를 만날경우 stack 저장했던 열린괄호를 다시 뽑아내고 삭제한다 -> '('가 저장되어 있지 않다면, EmptyStackException 예외 발생
                    stack.pop();
                }
            }
            // 반복문 종료 후, stack 값이 비어있으면, "( ~~~ )" 표현식을 잘 따른 것이고, stack 값이 비어져있지 않다면 표현식을 따르지 못한 것이다
            if (stack.isEmpty()) {
                // 표현식이 동일한 경우
                System.out.println("same");
            } else {
                // 표현식이 다른 경우
                System.out.println("not same");
            }
        } catch (EmptyStackException e) {
            // stack 에서 꺼내는 과정에서 비어있음을 발견했다면 첫 수식이 잘못된거기 때문에 역시나 표현식을 따르지 못했다고 생각해도 된다
            System.out.println("not same");
        }
    }
}
