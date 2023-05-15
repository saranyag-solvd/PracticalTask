public class Average1 {
    //Java program to find the average of 5 numbers using a while loop
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;
        // calculate Sum
        int i = 0;
        while (i < num.length) {
            sum = sum + num[i];
            i++;

        }
        //calculate average
        float average = (sum / num.length);
        System.out.println("average:" + average);

    }
}
