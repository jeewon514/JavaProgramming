class Sales{
    int cnt;
    public Sales(int cnt){
        this.cnt = cnt;
    }
    public int getSales(){
        return cnt++;
    }
}

public class SalesTest {
    public static void main(String[] args) {
        Sales s = new Sales(5);
        System.out.println(s.getSales());
    }
}
