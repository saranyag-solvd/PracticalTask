import java.util.Scanner;

public class RealNumbers {
    ////Java program to find the product of a set of real numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int Count = Integer.parseInt(input.nextLine());
        int i = 0;
        float product = 1.0f;
        for (i = 0; i < Count; i++) {
            System.out.println("Enter real number:");
            float x = Float.parseFloat(input.nextLine());
            product = product * x;

        }
        System.out.println("product of real numbers:" + product);
    }
}
