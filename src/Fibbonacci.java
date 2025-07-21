import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=1;

        System.out.println("Enter the number of terms in series: ");
        int n=sc.nextInt();
        System.out.print("Series is: ");
        for(int i=1;i<=5;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }

}
