import java.util.Scanner;

public class GroceryStore
{
    public static void main(String[] args)
    {
        double pearKg = 2.14,appleKg = 3.67,tomatoesKg = 1.11,bananaKg = 0.95,eggplantKg = 5.0;


        Scanner input = new Scanner(System.in);

        System.out.println("How many kilos of pears will you buy?");
        double pear = input.nextDouble();
        pear *= pearKg;

        System.out.println("How many kilos of apples will you buy?");
        double apple = input.nextDouble();
        apple *= appleKg;

        System.out.println("How many kilos of tomatoes will you buy??");
        double tomatoes = input.nextDouble();
        tomatoes *= tomatoesKg;

        System.out.println("How many kilos of bananas will you buy?");
        double banana = input.nextDouble();
        banana *= bananaKg;

        System.out.println("How many kilos of eggplant will you buy?");
        double eggplant = input.nextDouble();
        eggplant *= eggplantKg;

        double total = pear + apple + tomatoes + banana + eggplant;

        System.out.println("Total amount to be paid " + total);

    }
}
