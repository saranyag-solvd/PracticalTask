public class Average {
    // Java program to find out the average of a set of integers
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        float sum = 0;

        //calculate sum
        int i = 0;
        while (i < num.length) {
            sum = sum + num[i];

            i++;

        }
        // calculate average
        float average = (sum / num.length);
        System.out.println("Average:" + average);
    }
}