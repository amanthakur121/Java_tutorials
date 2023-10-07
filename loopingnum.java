import java.util.*;
public class loopingnum{
    public static void main(String args[]){
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        System.out.println("Press 1 to continue & 0 for stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input==1){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(num>0)
            positive++;
           else if(num<0)
            negative++;
            else
            zeros++; 
            System.out.println("Press 1 to continue & 0 to stop");
             input = sc.nextInt();
        }
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
         System.out.println("Zero numbers: "+zeros);        
    }
}