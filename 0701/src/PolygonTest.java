import java.util.Scanner;

class Polygon{
    String shape;int width;int height;double area;
    // 생성자
    public Polygon(int width, int height){
        this.width = width;this.height = height;
    }
    public Polygon(String shape){
        this.shape = shape;
    }
    // 메소드(사용자에게 선택 요청)
    public void showInfo(){
        System.out.print("menu select 1)삼각형 2)직사각형 3)정사각형:");

    }
    // 메소드(면적 계산)
    public void getArea(int menu){
        switch (menu){
            case 1:
                System.out.println("Triangle");
                System.out.println("area : " + width*height*0.5);
                break;
            case 2:
                System.out.println("Rectangle");
                System.out.println("area : " + width*height);
                break;
            case 3:
                System.out.println("Square");
                System.out.println("area : " + width*width);
                break;
        }
    }
}

public class PolygonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Polygon p = new Polygon(10,20);
        p.showInfo();
        // 사용자 입력
        int menu = sc.nextInt();
        p.getArea(menu);
    }
}
