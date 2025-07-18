package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseClass extends JFrame {
    JLabel lbl;
    public MouseClass(){
        setTitle("Mouse 이벤트 예제");
        lbl = new JLabel("cheer up");
        lbl.setForeground(Color.red);
        add(lbl);
        setLayout(new FlowLayout());

        // 리스너 등록
        this.addMouseListener(new MyMouse());

        setSize(400,400);
        setVisible(true);
    }
    class MyMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();int y = e.getY();
            lbl.setLocation(x,y);
            System.out.println("(" + x + ", " + y + ")");
            //System.out.println(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    public static void main(String[] args) {
        new MouseClass();
    }
}

