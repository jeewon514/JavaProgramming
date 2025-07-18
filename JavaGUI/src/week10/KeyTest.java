package week10;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTest extends JFrame {
    public KeyTest(){
        setTitle("키 이벤트 처리");
        //2. 리스너 등록
        addKeyListener(new Mykey());
        setSize(300,200);
        setVisible(true);
    }
    //1. 리스너 생성
    class Mykey implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            //System.out.println(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new KeyTest();
    }
}
