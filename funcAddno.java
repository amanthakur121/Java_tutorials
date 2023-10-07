import java.util.*;
public class funcAddno{
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String argd[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    calculateSum(a, b);
    System.out.println(sum);
    }

}