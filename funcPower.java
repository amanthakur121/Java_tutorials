import java.util.*;
public class funcPower {
    public static void gettingPower(int n, int x){
        int result = 1;
        for(int i=0;i<n;i++){
            result = result * x;
        }
        System.out.println("The x of power n is"+result);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter its power: ");
        int n = sc.nextInt();
        gettingPower(n, x);

    }
}