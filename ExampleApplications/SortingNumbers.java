import java.util.Scanner;

public class SortingNumbers
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the a number");
        int a = input.nextInt();

        System.out.println("Enter the b number");
        int b = input.nextInt();

        System.out.println("Enter the c number");
        int c = input.nextInt();

        if ((a > b) && (a > c))
        {
            if ((b > c))
            {
                System.out.println("a > b > c");
            } else
            {
                System.out.println("a > c > b");

            }
        }
        else if ((b > a) && (b > c))
        {
            if ((a > c))
            {
                System.out.println("b > a > c");
            } else{
                System.out.println("b > c > a");

            }
        }
        else
        {
            if ((a > b))
            {
                System.out.println("c > a > b");
            } else
            {
                System.out.println("c > b > a");

            }
        }



    }
}

