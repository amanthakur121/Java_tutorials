import java.util.*;
public class changeEtoI {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String result = "";
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i) == 'e'){
                result += 'i';
            }
            else{
                result += sentence.charAt(i);
            }
        }
        System.out.println(result);
    }
}
