import java.util.Scanner;

//Java program to check whether the given integer is a prime number or not
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (isPrime(input.nextInt())) {
            System.out.println("Is a prime number");

        } else
            System.out.println("Is not a prime number");
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

}










