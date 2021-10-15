package chapter12.annotation;

import java.util.ArrayList;

public class AnnotationEx3 {
    @SuppressWarnings ( "deprecation" ) // @deprecation 에 관련된 경고에 대해서 무시한다는 의미
    public static void main(String[] args) {
        NewClass newClass = new NewClass();

        newClass.oldField = 10;
        System.out.println( newClass.getOldField() );

        @SuppressWarnings ( "unchecked" ) // 뒤 ArrayList<>() 와 같은 형식으로 표현하지 않고 ArrayList()로 표현하여 타입이 지정되지 않아도
        // unchecked 로 설정하여 해당 경고를 무시할 수 있다 -> 전반적으로 사용하기 보단 경고의 억제범위를 최소화하기 위해 해당 좁은 범위로 설정해두는 것이 좋다
        ArrayList<NewClass> list = new ArrayList();
        list.add( newClass );
    }
}
