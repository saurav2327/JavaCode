import java.util.Scanner;
public class Evenodd {
    static void evenodd( int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("ODD");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        evenodd(num);
    }
}
