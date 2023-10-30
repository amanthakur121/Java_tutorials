import java.util.*;
public class charAt {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String str = sc.nextLine();
        String username = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== '@'){
                break;
            }
            else{
                username += str.charAt(i);
            }
        }
        System.out.println("username is: "+username);
    }
}
