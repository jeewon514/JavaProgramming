package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouseclass2 extends JFrame{
    JLabel lbl;
    public Mouseclass2(){
        setTitle("Mouse 이벤트 예제");
        lbl = new JLabel("cheer up");
        lbl.setForeground(Color.red);
        add(lbl);
        setLayout(new FlowLayout());
        //2. 리스너 등록
        this.addMouseListener(new MyMouse());

        setSize(400,400);
        setVisible(true);
    }
    //1. 내부 클래스로 어뎁터 리스너 작성
    class MyMouse extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();int y = e.getY();
            lbl.setLocation(x,y);
            System.out.println("(" + x + ", " + y + ")");
            //System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Mouseclass2();
    }
}
