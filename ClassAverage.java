import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args) {
        Scanner gradeScore = new Scanner(System.in);
        double total = 0;
        int gradeCounter = 1;
        while (gradeCounter <= 10) {
            System.out.println("Enter grade");
            double grade = gradeScore.nextDouble();
            total = total+ grade;
            gradeCounter++;
        }

        double average = total / 10;
        System.out.printf("%nTotal of all 10 grades is %f%n",total);
        System.out.printf("class average is %f%n", average);

    }



}
