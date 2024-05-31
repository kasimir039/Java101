import java.util.Scanner;

public class FlightTicketCalculation {

    public static void main(String[] args)
    {

        double distance = 0.10,total,normalAmount,ageDiscount,
                                discountedAmount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance in km");
        double kilometer = input.nextDouble();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter trip type");
        int choice = input.nextInt();


        if(kilometer <= 0 || age <= 0 || (choice != 1 && choice != 2))
        {
            System.out.println("Wrong choice");
        }

        normalAmount = kilometer * distance;

        if(age < 12)
            discountedAmount = 0.50;
        else if(age >= 12 && age <= 24)
            discountedAmount = 0.10;
        else if(age >= 65)
            discountedAmount = 0.30;

        ageDiscount = normalAmount * discountedAmount;

        total = normalAmount - ageDiscount;

        if(choice == 2)
            total *= 0.80 * 2;

        System.out.println("Total Amount" + total);





    }
}

