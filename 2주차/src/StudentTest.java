// 실습영상1
class Student{
    String nation = "대한민국";String name;
    int age;String dept;
    // 생성자
    public Student(String name, int age){
        //this.name = name;this.age = age;
    //겹치는 부분을 최대한 줄이기 위해서 !!!!!
        this(name,age,"컴퓨터공학과");
    }
    //생성자 오버로딩
    public Student(String name, int age, String dept){
        this.name = name;this.age = age;this.dept = dept;
    }

    // 메소드(접근자)
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    //설정자 메소드
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDept(){
        return dept;
    }

    public void show(){
        System.out.println("nation: " + nation);
        System.out.println("name: " + getName());
        System.out.println("age: " + getAge());
        System.out.println("dept: " + getDept());
        System.out.println();
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("구지원",23);
        Student s2 = new Student("구지원",23,"사이버보안학과");

        s1.show();
        s2.show();
    }
}
