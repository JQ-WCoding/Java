package baseballGame;

public class Computer extends Game {

    public Computer() {
        setBall();
    }

    private void setBall() {
        for (int i = 0; i < SIZE; i++) {
            balls[i] = (int) ( Math.random() * 10 );
        }

        if (checkDuplicate( balls )) {
            setBall();
        }
    }

    boolean checkNum( int[] myBall ) {
        int ball = 0;
        int strike = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (balls[i] == myBall[j]) {
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
