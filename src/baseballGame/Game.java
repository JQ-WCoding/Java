package baseballGame;

import java.util.Scanner;

public abstract class Game implements RunGame {
    protected Scanner scanner = new Scanner( System.in );

    protected void systemCheck( String str ) {
        if (str.equals( "-1" )) {
            System.exit( 0 );
        } else if (str.equals( "11" )) {
            run();
        }
    }

    protected abstract void input();
}
