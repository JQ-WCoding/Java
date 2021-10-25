package baseballGame;

import java.util.Arrays;

public class BaseballGame extends Game {
    private final int SIZE = 4;
    private final int[] BALL = new int[SIZE];
    private int[] myBall = new int[SIZE];
    int strike;
    int ball;

    public BaseballGame() {
        setBall();
    }

    @Override
    public void run() {
        setBall();
        System.out.println( "Com : " + Arrays.toString( BALL ) );

        while (strike != 4) {
            input();
            checking();
            System.out.println( "Strike: " + strike + " Ball: " + ball );
        }

        System.exit( 0 );
    }

    private void setBall() {
        for (int i = 0; i < SIZE; i++) {
            BALL[i] = (int) ( Math.random() * 10 );
        }

        if (checkDuplicate( BALL )) {
            setBall();
        }
    }

    private boolean checkDuplicate( int[] arr ) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (BALL[i] == BALL[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private void checking() {
        ball = 0;
        strike = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (BALL[i] == myBall[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
    }

    @Override
    protected void input() {
        System.out.print( "번호를 입력하세요 (-1 입력시, 종료) >>  " );
        String input = scanner.nextLine();

        systemCheck( input );

        String[] inputInt = input.split( "" );

        for (int i = 0; i < SIZE; i++) {
            myBall[i] = Integer.parseInt( inputInt[i] );
        }

        if (checkDuplicate( myBall )) {
            input();
        }

        System.out.println( "Mine : " + Arrays.toString( myBall ) );
    }
}
