public class OddNumbers {
    //Java program to find the number of odd numbers in an array
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("odd numbers");

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println(num[i]);

            }

        }
    }
}
