import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius");
        //calculate area
        //  3.14*r*r
        double r = input.nextDouble();
        double circle = 3.14 * r * r;
        double circumference = 2 * 3.14 * r;
        System.out.println("Area of circle:" + circle);
        System.out.println("Area of circumference:" + circumference);
    }
}
