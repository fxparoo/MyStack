import java.sql.SQLOutput;
import java.util.Scanner;
public class StudentAverage {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
          int Total = 0;
          int gradeCounter = 0;
          System.out.println("Enter grade or -1 to quit");
           int grade =  input.nextInt();
           while(grade!= -1){
               Total = Total + grade;
           gradeCounter++;
               System.out.println("Enter grade or -1 to quit");
              grade= input.nextInt();
                }
           if(grade!= 0){
               double average = (double)  Total / gradeCounter;
               System.out.printf("Total: %d%n Counter: %d%n Average: %.2f", Total, gradeCounter,average);

           }



    }

}

