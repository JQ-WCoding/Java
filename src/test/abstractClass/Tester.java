package test.abstractClass;

public class Tester {
    public static void main( String[] args ) {
        Sample sample1 = new SampleObject();
        Sample sample2 = new SampleObject2();

        Sample s1 = inject1();
        Sample s2 = inject2();
    }

    private static Sample inject1() {
        return new SampleObject();
    }

    private static Sample inject2() {
        return new SampleObject2();
    }
}
