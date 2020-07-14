public class TotalArray {
    public static void main(String[] args) {

        int supply[] = new int[]{1, 2, 3, 4, 5, 6};
        int Total = 0;
        for (int counter = 0; counter < supply.length; counter++) {
             Total=Total  + supply[counter];

        }

            System.out.println(Total);
    }
}