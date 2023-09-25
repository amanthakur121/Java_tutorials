import java.util.*;
public class psitiveNegitive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("the number is positive");
        }
        if(n<0)
        System.out.println("The number is negative");
        else if(n==0){
            System.out.println("the number is zero");
        }
        
        
    }
}