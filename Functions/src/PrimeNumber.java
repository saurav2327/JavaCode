import java.util.Scanner;
public class PrimeNumber {
    static void isprime(int n) {
        if (n < 2) {
            System.out.println("Invalid");
        } else {
            int c = 2;
            boolean found = false;
            while (c * c <= n) {
                if (n % c == 0) {
                    found = true;
                    break;
                }
                c++;

            }
            if (found != true) {
                System.out.println("Prime");
            } else System.out.println("Not prime");

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num: ");
        int num=sc.nextInt();
        isprime(num);

    }
}
