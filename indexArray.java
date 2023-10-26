
import java.util.*;
public class indexArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       } 
       System.out.println("Enter the value of x: ");
       int x = sc.nextInt();
       for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            System.out.println("the x is at index: "+i);
        }
        else{
            System.out.println("X is not present  in the ARRAY");
            break;
        }
    }
    }
}