class Employee{
    private String name;private int salary;
    public Employee(String name, int salary){
        this.name = name;this.salary = salary;
    }
    public String getName() {           //이름 반환 (gatter)
        return name;
    }
    public int getSalary() {            //급여 반환 (gatter)
        return salary;
    }
    public int raiseSalary() { 	 		// 금여 올림
        //int raised_salary;
        //raised_salary = (int)(salary*1.3);
        //return raised_salary;
        return (int)(salary*1.3);
    }
    public String showinfo() {          //객체의 현 상태를 반환
        return "이름: " + name + "\n급여: " + salary + "\n인상된 급여: " + raiseSalary();
    }
}
class Manager extends Employee{
    protected int bonus;
    //생성자 메서드
    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getbonus() {             // 보너스 반환
        return bonus;
    }
    public int raiseSalary() {          // 급여 올리기
        //int raised_salary;
        //int raised_salary = (int)(salary*1.2);
        //return raised_salary;
        return (int)(getSalary()*1.2);
    }
    public String showinfo() {          // 객체의 현 상태를 반환
        return super.showinfo() + "\n보너스: " + bonus;
    }
}
class Executive extends Manager{
    private int stockOption;
    // 생성자 메소드
    public Executive(String name, int salary, int bonus,int stockOption) {
        super(name, salary, bonus);
        this.stockOption = stockOption;
    }

    public int getStockOption() {       // 스톡옵션을 반환
        return stockOption;
    }
    public int raiseSalary() {          // 급여 올리기
        //int raised_salary;
        //int raised_salary = (int)(salary*1.1);
        //return raised_salary;
        return (int)(getSalary()*1.1);
    }
    public String showinfo() {          //  객체의 현상태 반환
        return super.showinfo() + "\n스톡옵션: " + stockOption;
    }

}
public class InheritanceTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee emp = new Employee("김이화", 100000);
        Manager man = new Manager("박이화", 200000,50000);
        Executive exc = new Executive("양이화", 400000,100000,100000);
        //급여 올리기
        emp.raiseSalary();
        man.raiseSalary();
        exc.raiseSalary();

        //결과 출력
        System.out.println("===Emplyee(직원)==");
        System.out.println(emp.showinfo());
        System.out.println();

        System.out.println("===Manager(매니저)==");
        System.out.println(man.showinfo());
        System.out.println();

        System.out.println("===Executive(임원)==");
        System.out.println(exc.showinfo());
        System.out.println();

    }

}
