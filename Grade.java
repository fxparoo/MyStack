import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        double gradeMax = 1;
        while (gradeMax < 10) {
            System.out.println("Enter Grade");
            double grade101 = marks.nextDouble();
            gradeMax++;
            if (grade101 >= 60) {
                System.out.println("passed");
            } else if (grade101 == 50) {
                System.out.println("Average");
            } else {
                System.out.println("Failed");
            }

        }

    }}