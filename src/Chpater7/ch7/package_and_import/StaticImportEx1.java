package Chpater7.ch7.package_and_import;

/*
 static을 이용하여 선언하였기 때문에 System.out의 System과
 Math.* 모든것의 Math 클래스를 명시하지 않고 out.print / random(), PI 등을 사용할 수 있다
 즉 PI는 Math를 전역에 설정하였기 때문에 Math.PI를 제외하고 참조할 것이 없기에 혼동하지 않고 불러 올 수 있다는 의미
 */
import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportEx1 {
    public static void main(String[] args) {

        out.println("Math.random() : " + random());

        out.println("Math.PI : " + PI);
    }
}
