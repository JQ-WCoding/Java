package test;

import java.util.ArrayList;
import java.util.List;

public class PrintTest {
    public static void main(String[] args) {
        // List<String> testList = new ArrayList<>();
        //
        // testList.add( "1" );
        // testList.add( "" );
        // testList.add( "3" );
        //
        // testList.forEach( System.out::println );

        Ball ball = new Ball();
        ball.ball( 1 );
        ball.ball( 4 );

        ball.ball( 2 );
        ball.ball( 8 );

        ball.ball( 3 );
        ball.ball( 5 );
    }

    static class Ball {
        private final int WHOLE_ROUND = 9;

        private int now = 0;

        private int maxLength;

        private final List<Integer> score = new ArrayList<>();

        private final List<Integer> roundScores = new ArrayList<>();

        public void ball(int num) {
            calculateScores( num );

            printScores();
        }

        private void printScores() {
            System.out.println( "score = " + score );
            System.out.println( "--------------------------" );
            System.out.println( roundScores );
        }

        private void calculateScores(int num) {
            score.add( num );

            ++now;

            maxLength = score.size();

            if ( now != WHOLE_ROUND ) {
                normalRound( maxLength );
            } else {
                finalRound( maxLength );
            }
        }

        private void normalRound(int maxLength) {
            if ( maxLength % 2 == 0 ) {
                roundScores.add( score.get( maxLength - 1 ) + score.get( maxLength - 2 ) );
            }
        }

        private void finalRound(int maxLength) {
            int lastRoundScore = score.get( maxLength - 1 ) + score.get( maxLength - 2 );

            if ( lastRoundScore == 10 ) {

            }
        }

    }
}
