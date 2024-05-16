import java.util.Scanner;

public class Taximeter
{
    public static void main(String[] args)
    {
        double km;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilecek Mesafenin Kilometre değerini giriniz:");
        km = input.nextDouble();

        double result = (km * 2.20) + 10;

        if(result < 20)
            result = 20;

        System.out.println("Ödenen tutar: "+result);

    }
}
