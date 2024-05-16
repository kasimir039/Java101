import java.util.Scanner;

public class Hypotenuse
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

         c = Math.sqrt((a*a + b*b));

         System.out.println("Hipotenüs: " + c);


    }
}
