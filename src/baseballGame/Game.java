package baseballGame;

public class Game {
    protected final int SIZE = 4;
    protected int[] balls = new int[SIZE];

    protected boolean checkDuplicate( int[] arr ) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
