import java.util.*;
public class string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");

        String firstName = sc.nextLine();
        System.out.println("Enter LAst name: " );
        String lastName = sc.nextLine();
        String fullName = firstName +" "+ lastName;
        System.out.println("The full name is: "+fullName);
    }
}
