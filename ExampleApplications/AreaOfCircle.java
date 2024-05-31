import java.util.Scanner;

public class AreaOfCircle
{
    public static void main(String[] args)
    {
        int r;
        double area, pi= 3.14 ,alpha;

        System.out.println("Enter the radius value:");
        Scanner input = new Scanner(System.in);

        r = input.nextInt();

        System.out.println("Enter the size of the central angle:");
        alpha = input.nextDouble();

        area = (pi * (r * r) * alpha) / 360;

        System.out.println("Area of circle segment:" + area);


    }
}
