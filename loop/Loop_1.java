package loop;

public class Loop_1 {
    public static void main(String[] args){
        //while(조건식) -> 참이면 while문 실행
        int count = 1;
        int sum = 0;
        while(count<4){
            sum = sum + count;
            count ++;
        }
        System.out.println(sum);
    }
}
