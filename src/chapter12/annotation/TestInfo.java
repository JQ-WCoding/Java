package chapter12.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention ( RetentionPolicy.RUNTIME )
public @interface TestInfo {
    // 함수 선언
    int count() default 1;

    String testedBy();

    // default 값을 통해 -> 값 대입 없이 기본값을 출력할 수 있도록 한다
    String[] testTools() default "JUnit";

    TestType testType() default TestType.FIRST;

    DateTime testDate();
}
