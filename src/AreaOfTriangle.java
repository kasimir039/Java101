import java.util.Scanner;

public class AreaOfTriangle
{

    public static void main(String[] args)
    {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);

        System.out.println("1.Kenar  değerini giriniz");
        a = input.nextInt();

        System.out.println("2.Kenar değerini giriniz");
        b = input.nextInt();

        System.out.println("3.Kenar değerini giriniz");
        c = input.nextInt();

        double u = (a + b + c) / 2;

        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

         System.out.println("Area of Triangle: " + area);


    }
}
