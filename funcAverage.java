import java.util.*;
public class funcAverage{
    public static int Average(int a, int b, int c){
     int sum = a+b+c;
     return sum;
    }
    public static void main(String argd[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int sum = a+b+c;
    Average(a, b, c);
   System.out.println(sum);
    }

}