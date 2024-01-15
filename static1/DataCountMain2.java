package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        Data2 data1 = new Data2("A", count1);
        System.out.println("A count = "+ count1.count);

        Data2 data2 = new Data2("B", count1);
        System.out.println("B count = "+ count1.count);

        Data2 data3 = new Data2("C", count1);
        System.out.println("C count = "+ count1.count);
    }
}
