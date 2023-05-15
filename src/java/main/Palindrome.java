import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        if (isPalindrome(input.nextLine().toLowerCase())) {
            System.out.println("Is a palindrome");
        } else
            System.out.println("Is not a palindrome");

    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;


        }
        return true;
    }
}


