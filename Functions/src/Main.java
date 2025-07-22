import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to add: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum is "+sum(a,b));
    }
    static int sum(int x,int y){
        return x+y;
    }
    }
