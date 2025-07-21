import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double amount = sc.nextDouble();
        double time=sc.nextDouble();
        double rate=sc.nextDouble();
        double SimpleInterest = (amount*rate*time)/100;
        System.out.println("The interst is: "+SimpleInterest);
    }

}
