import java.util.Scanner;
public class StudentScore{
    public static void main(String[] args) {
        int StudentScore = 0;
        Scanner input= new Scanner(System.in);
        while(StudentScore < 10) {
            StudentScore++;
            System.out.println("Enter Grade");
            double gradeMax = input.nextDouble();
            if (gradeMax >= 50) {
                System.out.println("passed");
            } else if (gradeMax == 49) {
                System.out.println("Average");
               }
            else{
                System.out.println("Failed");
                          }
        }

         }
}

