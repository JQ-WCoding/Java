package chapter11.collections;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        int[] score = {80, 90, 45, 25, 68, 100, 28};

        // treeSet 에 score 의 값을 순차적으로 저장
        for ( int i = 0; i < score.length; i++ ) {
            treeSet.add( new Integer( score[i] ) );
        }

        // headSet()과 tailSet() -> headSet()은 지정된 값을 max 기준으로 선택 / tailSet()은 꼬리를 지정 즉, 가장 마지막 값을 지정한다 (미만이 기준이다)
        System.out.println( "50이하의 수 : " + treeSet.headSet( new Integer( 50 ) ) );
        System.out.println( "50초과의 수 : " + treeSet.tailSet( new Integer( 50 ) ) );
    }
}
