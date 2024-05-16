import java.util.Scanner;

 class VatAmount {
    public static void main(String[] arg)
    {
        double money, vat = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.println("Para miktarını giriniz");
        money = input.nextDouble();
        double result = money * (1 + vat);

        if(money > 0 && money <= 100) {

            System.out.println("Kdv'siz Fiyat = " + money);
            System.out.println("Kdv'li Fiyat = " + result);
            System.out.println("Kdv Tutarı = " + vat);
        }
        else if (money >= 1000)
        {
            vat = 0.8;
            System.out.println("Kdv'siz Fiyat = " + money);
            System.out.println("Kdv'li Fiyat = " + result);
            System.out.println("Kdv Tutarı = " + vat);
        }

    }
}
