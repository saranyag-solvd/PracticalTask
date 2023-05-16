import java.util.Scanner;

public class PalindromeToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        if (isPalindrome(input.nextLine().toLowerCase())) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }

        System.out.println("Enter a number");
        int num = input.nextInt();
        if (isPalindrome(num)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }

    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(int inpNum) {
        int reversedNum = 0;
        int input = inpNum;
        while (input != 0) {
            int lastDigit = input % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            input = input / 10;
        }

        System.out.println("input number " + inpNum);
        System.out.println("reversed number " + reversedNum);
        if (inpNum == reversedNum) {
            return true;
        }
        return false;
    }
}
