// 익명 클래스로 Action 이벤트 리스너 만들기
package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonyClass extends JFrame {
    JButton btn1,btn2;
    public AnonyClass(){
        setTitle("액션이벤트 리스너 예제");
        setLayout(new FlowLayout());
        btn1 = new JButton("확인");
        btn2 = new JButton("취소");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("확인버튼 눌렀습니다.");
                btn1.setBackground(Color.red);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("취소버튼 눌렀습니다.");
            }
        });

        add(btn1);add(btn2);
        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonyClass();
    }
}

