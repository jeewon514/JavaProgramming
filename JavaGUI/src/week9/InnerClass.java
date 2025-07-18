// 내부 클래스로 Action 이벤트 리스너 만들기
package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClass extends JFrame {
    JButton btn1, btn2;   // 멤버변수로 정의하기

    public InnerClass(){
        setTitle("액션이벤트 리스너 예제");
        setLayout(new FlowLayout());
        btn1 = new JButton("확인");
        btn2 = new JButton("취소");
        // 2.리스너 등록(연결)
        btn1.addActionListener(new MyGUI1());
        btn2.addActionListener(new MyGUI2());

        add(btn1);add(btn2);
        setSize(300,150);
        setVisible(true);
    }
    // 1.내부 클래스로 이벤트 리스너 작성
    class MyGUI1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            setTitle("확인버튼을 눌렀습니다.");
            btn1.setText("OK");
        }
    }
    class MyGUI2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            setTitle("취소버튼을 눌렀습니다.");
            btn2.setText("X");
        }
    }

    public static void main(String[] args) {
        new InnerClass();
    }
}
