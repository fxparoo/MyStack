public class StockPut {
    public static void main(String[] args) {
        int stock[][] = {{4, 5, 6},  {7, 8, 9},};

        for (int row = 0; row < stock.length; row++) {
            for(int column=0; column<stock[row ].length;column++){
                System.out.print(stock[row][column]);
        }
            System.out.println();
        }
    }

}



