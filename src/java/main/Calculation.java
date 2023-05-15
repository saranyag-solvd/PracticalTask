import java.util.Scanner;

//Java program to check whether the given integer is a multiple of 5
public class Calculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num % 5 == 0) {
            System.out.println(num + "If number multiply by 5");
        } else
            System.out.println(num + "If number not multiply by 5");


    }
}

