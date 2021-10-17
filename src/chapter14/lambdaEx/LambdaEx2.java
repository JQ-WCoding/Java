package chapter14.lambdaEx;

public class LambdaEx2 {
    public static void main(String[] args) {
        // 선언된것이 빈 메소드
        MyFunction2 f = () -> {
        };

        // 빈값을 MyFunction2로 형변환하여 Object 참조 타입으로 선언
        Object obj = ( MyFunction2 ) (() -> {
        });

        // String 과 같은 객체로 변환하기 위해서는 인터페이스 형변환 이후 -> Object 로 다시 형변환하고 이후 원하는 타입인 String 으로 변환하기 위해 toString()메소드 사용
        String str = (( Object ) ( MyFunction2 ) (() -> {
        })).toString();

        // 인테페이스 -> 주소값 람다식
        System.out.println( f );
        System.out.println( obj );
        System.out.println( str );

        System.out.println( ( MyFunction2 ) (() -> {
        }) );

        //  sout()시, 기본 오버라이딩 하지 않아 기본 출력문으로 나오기에 toString() 작성하지 않은 것과 동일하다
        System.out.println( (( Object ) ( MyFunction2 ) (() -> {
        })).toString() );
    }
}
