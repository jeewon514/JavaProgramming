package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// 제목을 뺀 나머지가 컨텐트팬
public class KeyTest2 extends JFrame {
    Container c;
    JLabel lbl;
    public KeyTest2(){
        setTitle("Key 이벤트 처리");
        lbl = new JLabel("<Enter>키도 배경색이 변경됩니다.");
        lbl.setFont(new Font("",Font.BOLD,20)); //공통 글꼴 지정

        c = getContentPane();
        c.setBackground(Color.yellow);
        //2. 리스너 등록
        c.addKeyListener(new MyKey());

        add(lbl);
        setSize(400,400);
        setVisible(true);
        c.requestFocus();  //컨텐트펜 포커스 설정
    }
    class MyKey extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int b = (int)(Math.random()*256);

            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String color;
                c.setBackground(new Color(r,g,b));
                color = "(" + r + ", " + "g" + ", " + "b " + ")";
                lbl.setText(color);            //
            }
            if (e.getKeyChar() == 'q')
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        new KeyTest2();
    }
}
