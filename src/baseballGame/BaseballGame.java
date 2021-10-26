package baseballGame;


import java.util.Scanner;

public class BaseballGame extends Game implements RunGame {
    private final int[] myBall = new int[SIZE];
    Computer com = new Computer();

    public void run() {
        do {
            input();
        } while (com.checkNum( myBall ));
    }

    private void input() {
        Scanner scanner = new Scanner( System.in );

        System.out.print( "번호를 입력하세요 (-1 입력시, 종료) >>  " );
        String input = scanner.nextLine();
        String[] inputInt = input.split( "" );

        inputNum( inputInt );
    }

    private void inputNum( String[] inputInt ) {
        for (int i = 0; i < SIZE; i++) {
            myBall[i] = Integer.parseInt( inputInt[i] );
        }

        if (checkDuplicate( myBall )) {
            input();
        }
    }
}
