package array;
import java.util.Scanner;
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 숫자의 갯수를 입력해주세요 : ");
        int size = sc.nextInt();
        int[] score = new int[size];
        int total = 0;
        System.out.println(size +"개의 정수를 입력하세요 : ");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i];
        }
        double average = total / (double) score.length;
        System.out.println("입력한 점수의 합계 : " + total);
        System.out.println("입력한 점수의 평균 : " + average);
    }
}
