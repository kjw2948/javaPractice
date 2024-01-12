package class1;

import java.util.Scanner;

public class ClassStart1 {
    public static void main(String[] args) {
        {
            /*String student1Name = "학생1";
            int student1Age = 15;
            int student1Grade = 90;

            String student2Name = "학생2";
            int student2Age = 16;
            int student2Grade = 80;

            System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
            System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);*/
            Scanner sc = new Scanner(System.in);
            String[] studentName = new String[3];
            int[] studentAge = new int[3];
            int[] studentGrade = new int[3];

            for (int i = 0; i < 3; i++) {
                studentName[i] = sc.next();
                studentAge[i] = sc.nextInt();
                studentGrade[i] = sc.nextInt();
                }
            for (int i = 0; i < 3; i++) {
                System.out.println("이름 :" + studentName[i] + " 나이 :" + studentAge[i] + " 성적 :" + studentGrade[i]);
            }
        }
    }
}
