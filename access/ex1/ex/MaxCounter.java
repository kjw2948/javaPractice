package access.ex1.ex;

public class MaxCounter {
    private int count = 0;
    private int max;
    MaxCounter(int max){
        this.max = max;
    }
    public void increment(){
        if(max<=count) {
            System.out.println("최댓값을 넘을 수 없습니다");
            return;
        }
            count ++;
    }

    public int getCount(){
        return count;
    }
}
