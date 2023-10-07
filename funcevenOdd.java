import java.util.*;
public class funcevenOdd {
    public static void primeNum(int n){
        if(n%2==0){
            System.out.println("even NUMBER");
        }
        else{
            System.out.println("odd NUMBER");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeNum(n);
    }
}
