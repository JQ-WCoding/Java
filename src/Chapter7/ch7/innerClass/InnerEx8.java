package Chapter7.ch7.innerClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {
    public static void main(String[] args) {
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            /*
             addActionListener() 메소드의 매개변수를 사용하여 -> new 새로 인스턴스화 한다
             익명 클래스를 이용하여 코드를 변경하도록 한다 -> 즉 원하는 사용도에 맞게 커스터마이징 가능하다
             오버라이딩 하여 actionPerformed() 메소드 사용
             두번 세번 보기 이해가 조금 안됨!
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent!");
            }
        });
    }
}
