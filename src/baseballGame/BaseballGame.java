package baseballGame;


import java.util.Scanner;

public class BaseballGame extends Game implements RunGame {
    private final Computer COM = new Computer();

    public void run() {
        gameStart();
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
            balls[i] = Integer.parseInt( inputInt[i] );
        }

        if (checkDuplicate( balls )) {
            input();
        }
    }

    private void gameStart() {
        do {
            input();
        } while (COM.checkNum( balls ));
    }
}
