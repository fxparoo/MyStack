import java.util.Scanner;
public class TotalAverage {
    public static void main(String[] args) {
        int Total = 0;
        int gradeCounter = 0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter grade or -1 to  quit");
        int grade = input.nextInt();
           while(grade !=-1) {
               Total = Total + grade;
               gradeCounter++;
               System.out.println("Enter grade or -1 to  quit");
               grade = input.nextInt();

                   }
               if(gradeCounter!=0) {
                   double average = (double) Total / gradeCounter;
                   System.out.printf("Total: %d%n gradeCounter: %d%n average %.2f", Total,gradeCounter,average);
                   }

    }
}








