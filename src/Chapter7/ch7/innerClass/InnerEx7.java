package Chapter7.ch7.innerClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx7 {
    public static void main(String[] args) {
        // 버튼 생성
        Button button = new Button("GO"); // 인자값은 버튼 명칭 단순 등록 정도
        button.addActionListener(new EventHandler()); // addActionListener() 메소드는 매개변수로 ActionListener 인터페이스를 요한다.
        // 따라서, EventHandler 가 ActionListener 를 상속받아 인자값으로 넘긴다
    }
}

class EventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent!");
    }
}