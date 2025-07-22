import java.util.Scanner;
public class Circle {
    static double area(double radius){
        return 3.14*Math.pow(radius,2);
    }
    static double circumference(double radius){
        return 2*3.14*radius;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        double radius=sc.nextDouble();
        System.out.println("Area of a circle is: "+area(radius));
        System.out.println("Circumference of a circle is: "+circumference(radius));
    }

}
