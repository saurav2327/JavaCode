import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int fact=1;

        String output="";
        if(n<2){
            System.out.println(n+"!="+1);
        }
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
                output += i;
                if (i != n) {
                    output += "*";
                }

            }
//            System.out.println(output);
            System.out.println(n + "!=" + output + "="+" "+fact);
        }
    }
}
