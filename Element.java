public class Element{
    public static void main(String[] args) {
        int number [] = new int[10];
         for(int counter=0;counter<number.length;counter++){
              if(counter== 7 || counter ==9){
                  continue;
              }
             System.out.printf("%5d%8d%n",counter,number[counter]);
         }
    }
}
