package access.ex2;

public class MaxCounter {
    private int count=0;
    private int max;
    MaxCounter(int max){
        this.max = max;
    }
    void increment() {
        if(count>=max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }
    int getCount(){
        return count;
    }
}
