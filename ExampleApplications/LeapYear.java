import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Artık yıl");
        else
            System.out.println("Artık yıl değildir");
    }
}
