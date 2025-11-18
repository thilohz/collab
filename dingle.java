import java.util.*;
public class dingle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer: "); // User inputs size for square array
        int size = scan.nextInt();

        int[][] arr = fillSquareArray(size);
        System.out.println("\n"+arr);
        System.out.println("\nFirst even number: " + returnEven(arr));
        System.out.println("First even number with neighbors sum > 17: " + returnEvenSum(arr));
        System.out.println("First odd number with all neighbors sum > 33: " + returnOddSum(arr));
    }

    // Creates a square array of size x by x (user input)
    // Fills it with random numbers from 1-10
    public static int[][] fillSquareArray(int x){
        int[][] arr = new int[x][x];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*11)+1;
            }
        }
        return arr;
    }

    // Returns first even number in the array
    // Loops through it in row major order
    public static int returnEven(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] %2 == 0) return arr[i][j];
            }
        }
        return 0;
    }

    // Returns first even number whose left+right neighbors sum > 17
    public static int returnEvenSum(int[][] arr) {
        int[][] directions = { {0, -1}, {0, 1} }; // left, right

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) continue;

                int sum = 0;
                for (int[] d : directions) {
                    int ni = i + d[0];
                    int nj = j + d[1];
                    if (ni >= 0 && ni < arr.length && nj >= 0 && nj < arr[i].length) {
                        sum += arr[ni][nj];
                    }
                }
                
                if (sum > 17) return arr[i][j];
            }
        }
        return 0;
    }

    // Returns first odd number whose neighbors sum > 33
    public static int returnOddSum(int[][] arr) {
        int[][] directions = { {-1,0}, {1,0}, {0,-1}, {0,1} }; // up, down, left, right
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) continue; 
                
                int sum = 0;
                for (int[] d : directions) {
                    int ni = i + d[0];
                    int nj = j + d[1];
                    
                    if (ni >= 0 && ni < arr.length && nj >= 0 && nj < arr[i].length) {
                        sum += arr[ni][nj];
                    }
                }

                if (sum > 33) return arr[i][j];
            }
        }
        return 0;
    }



}