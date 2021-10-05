package chapter10.format;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatEx4 {
    public static void main(String[] args) throws Exception {
        // 절대 경로 final 작성
        final String ROUTE = "D:\\Code\\Java\\src\\chapter10\\format\\";

        String fileName = "data4.txt";
        String message = "({0}, {1}, {2}, {3})";

        Scanner scanner = new Scanner(new File(ROUTE + fileName));

        String pattern = "{0}, {1}, {2}, {3}";
        MessageFormat messageFormat = new MessageFormat(pattern);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Object[] objects = messageFormat.parse(line);
            System.out.println(MessageFormat.format(message, objects));
        }

//        scanner.close(); // 이제는 굳이 안해도 괜츈....
    }
}
