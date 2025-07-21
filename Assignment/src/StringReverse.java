import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s1=sc.nextLine();
        String s2="";
        int l=s1.length()-1;
        while(l>=0){
            s2= s2 + s1.charAt(l);
            l--;

        }
        System.out.println(s2);
        if (s1.equals(s2)){
            System.out.println("It is an palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
