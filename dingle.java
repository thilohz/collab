import java.util.*;
public class dingle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int size = scan.nextInt();

        int[][] arr = fillSquareArray(size);
        System.out.println("\nPrint first even number: " + returnEven(arr));
    }

    public static int[][] fillSquareArray(int x){
        int[][] arr = new int[x][x];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; i<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*11)+1;
            }
        }
        return arr;
    }

    public static int returnEven(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] %2 == 0) return arr[i][j];
            }
        }
        return 0;
    }


}