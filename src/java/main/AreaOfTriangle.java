import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length for first side of triangle");
        double a = sc.nextDouble();
        System.out.println("Enter length for second side of a triangle");
        double b = sc.nextDouble();
        System.out.println("Enter length for third side of a triangle ");
        double c = sc.nextDouble();

       AreaOfTriangle triangle = new AreaOfTriangle();
       if(triangle.Sides(a,b,c)){
           double area = triangle.Area(a,b,c);
           System.out.println("area of triangle is found");
       }else
           System.out.println("Area of triangle is not found");
    }




    //Calculating area of triangle
    private double Area(double a, double b, double c){
       double p = a+b+c/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    // check for all three sides
    private Boolean Sides(double a, double b, double c){
        if((a+b)>c && (b+c)>a && (c+a)>b){
            return true;
        } else
        return false;
    }
}
