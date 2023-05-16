public class Factorial {
    public static void main(String[] args) {
        int num =6;
        long factorial = multiplyNumbers(num);
        System.out.println("enter factorial num:"+num+ "="+ factorial);
    }

    private static long multiplyNumbers(int num) {
        if(num>=1)
            return num* multiplyNumbers(num-1);
        else
            return 1;

    }


}
