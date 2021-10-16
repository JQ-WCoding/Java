package chapter12.annotation;

import java.lang.annotation.Annotation;

@Deprecated // 사용 비추천
@SuppressWarnings ( "1111" )
@TestInfo ( testedBy = "aaa", testDate = @DateTime ( yymmdd = "210101", hhmmss = "235959" ) )
// TestInfo 어노테이션에 정의 되어 있는 함수들
public class AnnotationEx5 {
    public static void main(String[] args) {
        // Class 참조변수 타입 <AnnotationEx5>으로 인스턴스화
        Class<AnnotationEx5> classEx5 = AnnotationEx5.class;

        // TestInfo 어노테이션 타입 -> AnnotationEx5의 annotation 을 가져온다 -> TestInfo.class 인자값으로 던져
        TestInfo annotationEx = ( TestInfo ) classEx5.getAnnotation( TestInfo.class );
        // -> 해당 함수들 출력 -> 상단에 선언된 값대로 출력된다
        System.out.println( "annotationEx.testedBy() : " + annotationEx.testedBy() );
        System.out.println( "annotationEx.testDate().yymmdd() :  : " + annotationEx.testDate().yymmdd() );
        System.out.println( "annotationEx.testDate().hhmmss() : " + annotationEx.testDate().hhmmss() );

        // testTools()를 통해 가지고 포함하는 해당 값을 모두 출력한다
        for ( String str : annotationEx.testTools() ) {
            System.out.println( "testTools : " + str );
        }
        System.out.println();

        Annotation[] annotations = classEx5.getAnnotations();
        // Annotation 전부 출력하기 -> 값까지 포함된 형식으로 출력된다
        for ( Annotation annotation : annotations ) {
            System.out.println( annotation );
        }
    }
}
