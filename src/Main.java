import java.io.Console;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int matematik, fizik ,kimya , turkce, tarih , muzik ;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;

        String sonuc = ortalama > 60 ? "Geçti" : "Kaldı";

        System.out.println(sonuc);
    }

}