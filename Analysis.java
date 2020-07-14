import java.util.Scanner;
public class Analysis {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passed = 0;
        int failure = 0;
        int StudentCounter = 1;
        while(StudentCounter<=10){
             System.out.print("Enter Result(1= passed, 2= failure): ");
             int result = input.nextInt();
             if(result == 1)
                 passed++;
             else
                 failure++;

             StudentCounter++;
              }
        System.out.printf("passed:%d%n,  failed:%d%n",passed , failure);
                    if(passed > 8)
                        System.out.println("Bonus to instructor!");
         }


    }







