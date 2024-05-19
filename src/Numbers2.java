import java.util.Scanner;

/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

public class Numbers2
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);



        int total = 0;

        int n;

        do {
            n = input.nextInt();

            if(n % 2 == 0  && n % 4 == 0)
            {
                total += n;
            }

        }while (!(n % 2 == 1));

        System.out.println("Total: " + total);

    }




}
