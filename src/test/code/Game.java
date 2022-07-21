package test.code;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Integer> scores = new ArrayList<>();

    private final int TOTAL_BOARD = 10;

    public void pin(int pin) throws Exception {
        boolean isGo = checkInt( pin );

        if ( !isGo ) {
            throw new Exception("Wrong Pin Number");
        }

        scores.add( pin );

        scoreBoard(10);
        totalBoard( 10 );
    }

    private boolean checkInt(int number) {
        return number <= 10 && number >= 1;
    }

    private void scoreBoard(int score) {
        for ( int i = 1; i <= TOTAL_BOARD; i++ ) {
            System.out.print(i + ": [  ]");
        }
        System.out.println();
    }

    private void totalBoard(int score) {
        for ( int i = 1; i <= TOTAL_BOARD; i++ ) {
            System.out.print("[  ]");
        }
    }
}
