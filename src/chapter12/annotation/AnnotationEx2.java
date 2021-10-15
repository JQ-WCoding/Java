package chapter12.annotation;

public class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass newClass = new NewClass();

        // 출력은 되지만 @Deprecated 가 작성되어 있는 필드값과 메소드를 작성할경우 -> 취소선이 표시된다
        // 새로운 대체가 있거나 업데이트되어 더이상 사용을 권하지 않는 경우 해당 어노테이션을 작성하여 인지시켜준다
        newClass.oldField = 10;
        System.out.println( newClass.getOldField());
    }
}
