import java.util.Scanner;

// Java Program to Check Whether the Generated Random Number Is Even or Odd
public class RandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else
            System.out.println("Number is odd");
    }
}
