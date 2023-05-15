import java.util.Scanner;

//Java program to check leap year
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a year");
        int year = input.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Its a leap year");
        } else
            System.out.println("Not a Leap year");
    }
}
