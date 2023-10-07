import java.util.*;
public class circumOfCircle{
    public static double circumfrenceOfCircle(double radius){
      return 3* 3.14 * radius;
    }
    public static void main(String argd[]){
    Scanner sc = new Scanner(System.in);
      double radius = sc.nextDouble();
        System.out.println(circumfrenceOfCircle(radius));
     
    }

}