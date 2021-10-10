package chapter11.collections;

import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        String from = "b";
        String to = "d";

        treeSet.add( "abc" );
        treeSet.add( "acro" );
        treeSet.add( "bat" );
        treeSet.add( "class" );
        treeSet.add( "car" );
        treeSet.add( "Class" );
        treeSet.add( "discount" );
        treeSet.add( "Dot" );
        treeSet.add( "elevator" );
        treeSet.add( "frost" );
        treeSet.add( "fuel" );

        System.out.println( treeSet );
        System.out.println( "Range: search from " + from + " to " + to );
        // subSet()로 TreeSet 에서 값을 찾을 수 있다 -> 다시 TreeSet 으로 반환?!
        System.out.println( "result1 : " + treeSet.subSet( from, to ) );
        // d 이상의 것을 출력하지 않지만 dzzz 로 변경하여 discount 는 더 작은 값이기에 출력 -> 대문자 D 는 더 큰 수기에 출력되지 않는다
        System.out.println( "result2 : " + treeSet.subSet( from, to + "zzz" ) );
    }
}
