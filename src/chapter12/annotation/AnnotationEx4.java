package chapter12.annotation;

public class AnnotationEx4 {
    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1", "2", "3");

        System.out.println(list);

        /* @SafeVarargs
         non-reifiable 비 구체화 타입 -> 타입 소거자에 의해 컴파일 타임에 타입 정보가 사라지는 것(런타임에 구체화하지 않는 것)
         -> 해당의 경우 "unchecked" 경고 발생 -> 하지만 해당 코드에 문제가 없다면 @SafeVarargs 어노테이션을 사용해 경고를 억제하는 방법이 있다
         - 해당 어노테이션은 생성자와 static, final 이 붙은 메소드에만 붙일 수 있다
         이 이노테이션은 컴파일러가 체크해서 코드상 아무 문제가 없는 경우, 타입 안정이 있기 때문에 경고를 발생할 필요가 없다와 같이 표현이 가능하다
         -> 즉, 내가 사용하는 메소드와 인자값에 대한 정확한 인지를 통해 사용해야하기에 또 고민해봐야한다
         @SafeVarargs @SuppressWarnings("varargs") 와 같이 두가지를 항상 같이 사용하는 것을 추천한다
        */
    }
}
