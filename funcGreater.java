import java.util.*;
public class funcGreater{
    public static void Greaternum(int a,int b){
        if(a<b)
        System.out.println("The grater number is: "+a);
        else if(a>b)
        System.out.println("The greater number is: "+b);
        
    }
    public static void main(String argd[]){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
        Greaternum(a, b);
     
    }

}
