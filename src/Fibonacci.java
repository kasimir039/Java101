import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number n: ");
        int n = input.nextInt();

        long fib = 1, prev = 0;

        for (int i = 1; i <= n; i++) {
            long temp = fib;
            fib += prev;
            prev = temp;
            System.out.println(fib);

        }

    }
}
