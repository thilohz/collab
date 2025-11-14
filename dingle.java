public class dingle{
    public static void main(String[] args){

    }

    public void fillSquareArray(int x){
        int[][] arr = new int[x][x];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; i<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*11)+1;
            }
        }
    }


}