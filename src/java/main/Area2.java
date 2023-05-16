public class Area2 {
    //Java program to find the sum of the digits of an integer using a while loop
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 5, 6, 7};
        int sum = 0;

        int i = 0;
        while (i < num.length) {
            sum = sum + num[i];
            i++;

        }
        System.out.println("Sum of digits:" + sum);
    }
}
