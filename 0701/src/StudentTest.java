class Student{
    String country;String name;int age;String major;
    // 생성자(오버로딩)
    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }
    public Student(String country, String name, int age, String major){
        this.country = country;this.name = name;
        this.age = age;this.major = major;
    }

    // 메소드
    public String showInfo(){
        return "name: " + name;
    }
    public String showInfo1(){    // 문자열+숫자 반환->String
        return "age: " + age;
    }
    public String showInfo2(){
        return "국가: " + country + ", 이름: " + name + ", 나이: " + age + ", 전공: " + major;
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("구지원");
        System.out.println(s.showInfo());
        Student s1 = new Student(23);
        System.out.println(s1.showInfo1());
        Student s2 = new Student("한국","구지원",23,"컴퓨터공학과");
        System.out.println(s2.showInfo2());
    }
}
