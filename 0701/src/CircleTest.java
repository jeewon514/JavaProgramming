class Circle{
    String name;int radius;
    // 생성자
    public Circle(String name, int radius){
        this.name = name;this.radius = radius;
    }
    // 메소드
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public void getPrint(){
        System.out.printf("%s의 면적은 %.1f, 둘레 길이는 %.1f\n",name,getArea(),getPerimeter());
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle("자바피자",10);
        c1.getPrint();
        Circle c2 = new Circle("도넛피자",5);
        c2.getPrint();
    }
}
