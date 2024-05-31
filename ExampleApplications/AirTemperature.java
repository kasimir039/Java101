import java.util.Scanner;

class AirTemperature {

    /*
    Koşullar :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature value");

        double heat = input.nextDouble();

        if(heat <= 5)
            System.out.println("You can ski");
        else if(heat > 5 && heat < 15)
            System.out.println("You can go to the cinema");
        else if(heat > 15 && heat < 25)
            System.out.println("You can have a picnic");
        else if(heat >= 25)
            System.out.println("You can swimming");

    }

}