//실습영상2
//매개변수의 개수가 명확하지 않은 경우
class Score{
    int sum1(int[] values){
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        //for (int i:values){
            //sum += i;
        //}
        return sum;
    }
}

public class ScoreTest {
    public static void main(String[] args) {
        Score s = new Score();

        int[] values = {10,20,30,40};
        int result = s.sum1(values);

        System.out.println("result: " + result);
    }

}
