import java.util.Scanner;


public class Numbers3
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = input.nextInt();

        System.out.println(n + " = Powers of 4:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println(n + " = Powers of 5:");
        for (int j = 1; j <= n; j *= 5) {
            System.out.println(j);
        }

    }
}
