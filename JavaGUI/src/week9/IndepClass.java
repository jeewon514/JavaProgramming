// 독립 클래스로 Action 이벤트 리스너 만들기
package week9;

import javax.swing.*;        // 다양한 컴포넌트
import java.awt.*;           // 배치관리자: 클래스와 인터페이스
import java.awt.event.*;     // 다양한 리스너 인터페이스

// 2.독립된 클래스로 이벤트 리스너 작성
class MyGUI implements ActionListener { //클릭관련:ActionsListener

    @Override
    public void actionPerformed(ActionEvent e) {
        // 4.실행할 명령어 쓰기
        JButton btn = (JButton)e.getSource();
        //Object getSource(): 발생한 이벤트 소스 컴포넌트 리턴
        if (btn.getText().equals("확인")) // 읽어옴
            btn.setText("OK");           // 출력
        else
            btn.setText("확인");
    }
}
// 1.원래 하던 것들 쓰기
public class IndepClass extends JFrame {
    public IndepClass(){
        setTitle("액션이벤트 리스너 예제");
        setLayout(new FlowLayout());
        JButton btn = new JButton("확인");

        // 3.리스너 등록
        btn.addActionListener(new MyGUI());
        add(btn);
        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new IndepClass();
    }
}
