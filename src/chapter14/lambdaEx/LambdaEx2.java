package chapter14.lambdaEx;

public class LambdaEx2 {
    public static void main(String[] args) {
        // 선언된것이 빈 메소드
        MyFunction2 f = () -> {
        };

        Object obj = ( MyFunction2 ) (() -> {
        });

        String str = (( Object ) ( MyFunction2 ) (() -> {
        })).toString();

        // 인테페이스 -> 주소값 람다식
        System.out.println( f );
        System.out.println( obj );
        System.out.println( str );

        System.out.println( ( MyFunction2 ) (() -> {
        }) );

        System.out.println( (( Object ) ( MyFunction2 ) (() -> {
        })).toString() );
    }
}
