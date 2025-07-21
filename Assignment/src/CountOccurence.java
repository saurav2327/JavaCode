import java.util.Scanner;
public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;
        int reversed=0;
        System.out.println("Give the number: ");
        int num= sc.nextInt();
        System.out.println("give the countnumber ");
        int countnum=sc.nextInt();
        if(num==0 && countnum==0){
            count=1;
        }
        while(num>0){
            int digit= num%10;
            reversed=reversed*10 +digit;
            if(digit==countnum){
                count++;
            }
            num=num/10;
        }
        System.out.println("Counting of occurence is "+ count);
        System.out.println("reversed number is: "+ reversed);

    }
}
