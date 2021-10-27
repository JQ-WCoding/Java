package baseballGame;

public class Computer extends Game {
    private final int[] COM_BALL = new int[SIZE];

    public Computer() {
        setBall();
    }

    private void setBall() {
        for (int i = 0; i < SIZE; i++) {
            COM_BALL[i] = (int) ( Math.random() * 10 );
        }

        if (checkDuplicate( COM_BALL )) {
            setBall();
        }
    }

    boolean checkNum( int[] myBall ) {
        int ball = 0;
        int strike = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (COM_BALL[i] == myBall[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                    break;
                }
            }
        }
        print( strike, ball );

        return strike != 4;
    }

    private void print( int strike, int ball ) {
        System.out.println( "Strike : " + strike + " Ball : " + ball );
    }
}
