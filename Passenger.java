import java.util.Scanner;

public class Passenger {


    public static void main(String[] args) {
        boolean  []  flight = new boolean[10];
        Scanner input =  new Scanner(System.in);

        while(true) {
            System.out.print("please enter 1 for FIRST CLASS  or enter 2 for SECOND CLASS");
            int response = input.nextInt();

            if (response == 0) break;

            if(response ==1) {
                for (int i = 0; i < 5; i++) {
                    if (flight[i]== false ) {
                        flight[i] = true;
                        System.out.println("Your seat number is :%d");

                    }
                }

            }
              else if (response==2){
                  for (int  i = 5; i<5; i++){
                  }
              }
              for(boolean seat: flight ) System.out.print(seat + " ");
            System.out.println();
        }
    }


}




