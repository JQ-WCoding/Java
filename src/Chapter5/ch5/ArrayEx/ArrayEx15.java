package Chapter5.ch5.ArrayEx;

public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        // 모스부호 a ~ z
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-"
                , ".--", "-..-", "-.--", "--.."};

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < source.length(); i++) {
            result.append(morse[source.charAt(i) - 'A']);
        }

        System.out.println("source : " + source);
        System.out.println("morse : " + result);
    }
}
