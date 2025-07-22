import java.util.Scanner;
public class GreatestofthreeNum {
    static void largest(int a,int b,int c){
        if(a>b&&a>c){
            System.out.println(a+" is greatest.");;
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest.");
        }
        else {
            System.out.println(c+" is greatest.");
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x,y,z;
       System.out.println("Enter the numbers: ");
       x=sc.nextInt();
       y=sc.nextInt();
       z=sc.nextInt();
       largest(x,y,z);
    }
}
