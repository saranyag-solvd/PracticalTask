import java.util.Scanner;

// Java program to check whether the given integer is a multiple of both 5 and 7
public class Calculation1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println(num + "Multiple if by 5 and 7");
        } else System.out.println(num + "Multiply if not by 5 and 7");

    }
}
