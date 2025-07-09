class Calculator{
    int num1;int num2;
    public Calculator(int num1, int num2) {
        this.num1 = num1;this.num2 = num2;
    }

    public double operator1() {
        return num1 + num2;       // return만 하고 출력은 안하고 있음
    }
    public double operator2() {
        return num1 - num2;
    }
    public void operator3() {
        System.out.println(num1 * num2);
    }
    public void operator4() {
        if(num2 == 0)
            System.out.println("Indivisible by zero");
        else
            System.out.println((double)num1 / num2);

    }
}

public class CalculatorTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator c1 = new Calculator(10, 2);
        // 위에 return만 하니까 출력해주기(double)
        System.out.println(c1.operator1());
        System.out.println(c1.operator2());
        //위에서 이미 출력했으니까 그냥(void)
        c1.operator3();c1.operator4();
    }

}
