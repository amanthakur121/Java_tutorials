
import java.util.*;
public class transposeMAtrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int [rows][col];

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int j=0;j<col;j++){
         for(int i=0;i<rows;i++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println( );

        }
    }
}
