import java.util.Scanner;

//Java program to check whether the given number is even or odd
public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Integer.parseInt(input.nextLine());
        if (num % 2 == 0) {
            System.out.println(num + "Is Even");

        } else
            System.out.println(num + "is Odd");


    }

}

