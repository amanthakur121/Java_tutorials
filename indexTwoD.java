
import java.util.*;
public class indexTwoD {
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
        int x = sc.nextInt();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j] == x){
                    System.out.println("The X is at index: "+i+ "," +j );

                }
            }
            

        }
    }
}
