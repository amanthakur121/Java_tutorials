import java.util.*;
public class stringbuliderFunc {
    // Functions used in string builders.
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("tonny");
        //Set a character
        sb.setCharAt(0, 'p');

System.out.println(sb);


// insert a char
sb.insert(2,'n');
 System.out.println(sb);


 //deleting a char
 sb.delete(2, 3);
 System.out.println(sb);


 //Append a char
 sb.append("aman");
 sb.append("aman");
 System.out.println(sb);
    }
}
