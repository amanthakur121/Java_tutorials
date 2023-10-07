
import java.util.*;
public class elligibility{
    public static void eligibleForVote(int a){
        if(a>=18){
        System.out.println("You are eligible for vote");
        }
        else if(a<18){
        System.out.println("You are not eligible for vote");
        
        }
        
        if(a<=0){
            System.out.println("Invalid Age");
        }
        
    }
    public static void main(String argd[]){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      eligibleForVote(a);
      
     
    }

}