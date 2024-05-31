import java.util.Scanner;

/*
    Koç Burcu : 21 Mart - 20 Nisan

    Boğa Burcu : 21 Nisan - 21 Mayıs

    İkizler Burcu : 22 Mayıs - 22 Haziran

    Yengeç Burcu : 23 Haziran - 22 Temmuz

    Aslan Burcu : 23 Temmuz - 22 Ağustos

    Başak Burcu : 23 Ağustos - 22 Eylül

    Terazi Burcu : 23 Eylül - 22 Ekim

    Akrep Burcu : 23 Ekim - 21 Kasım

    Yay Burcu : 22 Kasım - 21 Aralık

    Oğlak Burcu : 22 Aralık - 21 Ocak

    Kova Burcu : 22 Ocak - 19 Şubat

    Balık Burcu : 20 Şubat - 20 Mart
*/
public class Horoscope
{
    public static void main(String[] args)
    {
        int month,day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose your birth month");
        month = input.nextInt();

        System.out.println("Choose the day you were born");
        day = input.nextInt();

        if ((month >= 1) && (month <= 12)) {
            if (month == 1) {
                if ((day >= 1) && (day <= 22))
                    horoscope = "Capricorn";
                else if ((day >= 22) && (day <= 31))
                    horoscope = "Aquarius";
            else
                isError = true;
            }

           else if (month == 2) {
                if ((day >= 1) && (day <= 19))
                    horoscope =  "Aquarius";
                 else if ((day >= 20) && (day <= 28))
                    horoscope = "Pisces";
                 else
                    isError = true;
            }

            else if (month == 3) {
                if ((day >= 1) && (day <= 20))
                    horoscope =  "Pisces";
                else if ((day >= 21) && (day <= 31))
                    horoscope = "Aries";
                else
                    isError = true;
            }

            else if (month == 4) {
                if ((day >= 1) && (day <= 20))
                    horoscope =  "Aries";
                else if ((day >= 21) && (day <= 30))
                    horoscope = "Taurus";
                else
                    isError = true;
            }

            else if (month == 5) {
                if ((day >= 1) && (day <= 21))
                    horoscope =  "Taurus";
                else if ((day >= 22) && (day <= 31))
                    horoscope = "Gemini";
                else
                    isError = true;
            }

            else if (month == 6) {
                if ((day >= 1) && (day <= 22))
                    horoscope =  "Gemini";
                else if ((day >= 23) && (day <= 30))
                    horoscope = "Cancer";
                else
                    isError = true;
            }

            else if (month == 7) {
                if ((day >= 1) && (day <= 22))
                    horoscope =  "Cancer";
                else if ((day >= 23) && (day <= 31))
                    horoscope = "Leo";
                else
                    isError = true;
            }

            else if (month == 8) {
                if ((day >= 1) && (day <= 22))
                    horoscope =  "Leo";
                else if ((day >= 23) && (day <= 31))
                    horoscope = "Virgo";
                else
                    isError = true;
            }

            else if (month == 9) {
                if ((day >= 1) && (day <= 22))
                    horoscope =  "Virgo";
                else if ((day >= 23) && (day <= 30))
                    horoscope = "Libra";
                else
                    isError = true;
            }

            else if (month == 10) {
                if ((day >= 1) && (day <= 22))
                    horoscope =  "Libra";
                else if ((day >= 23) && (day <= 31))
                    horoscope = "Scorpio";
                else
                    isError = true;
            }

            else if (month == 11) {
                if ((day >= 1) && (day <= 22))
                    horoscope =  "Scorpio";
                else if ((day >= 23) && (day <= 30))
                    horoscope = "Sagittarius";
                else
                    isError = true;
            }

            else if (month == 12) {
                if ((day >= 1) && (day <= 22))
                    horoscope =  "Sagittarius";
                else if ((day >= 23) && (day <= 31))
                    horoscope = "Capricorn";
                else
                    isError = true;
            }

        }

        if(isError)
        {
            System.out.println("Hatalı giriş yaptınız");
        }
        else{
            System.out.println("Burcunuz " + horoscope);
        }

    }


}