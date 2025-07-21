
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("enter the input of two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int mini=Math.min(a,b);
        int HCF=1 ;
        if(a==0 || b==0){
            System.out.println("HCF is "+Math.max(a,b));
        }
       else {
               for (int i = mini; i >= 1; i--)
               {
                if (a % i == 0 && b % i == 0)
                {
                    HCF = i;
                    System.out.println("HCF is " + HCF);
                    break;
                }
            }
        }
        int LCM= (a*b)/HCF;
        System.out.println("LCM is "+LCM );
    }
}
