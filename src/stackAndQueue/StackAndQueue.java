package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
    public static void main( String[] args ) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.push( 1 );
        stack.push( 2 );
        stack.push( 3 );

        while (!stack.empty()) {
            System.out.println( "stack = " + stack.pop() );
        }

        queue.offer( 1 );
        queue.offer( 2 );
        queue.offer( 3 );

        while (!queue.isEmpty()) {
            System.out.println( "queue = " + queue.poll() );
        }

    }
}
