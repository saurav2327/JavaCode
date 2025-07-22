import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 122;
        int sum = 0;
        int unit = n % 10;
        System.out.println(unit);
        while (n != 0) {
            int rem = n % 10;
            sum=sum*10+rem;
            n = n / 10;

        }

        if (unit == 0) {
            System.out.println(0 + "" + sum);
        } else {
            System.out.println(sum);
        }



    }
}


