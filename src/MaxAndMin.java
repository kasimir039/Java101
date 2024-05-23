import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?: ");
        int n = input.nextInt();

        int number;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {

            System.out.print(i + ".number: ");
            number = input.nextInt();

            if (number > max)
                max = number;

            if (number < min)
                min = number;

        }
        if(min == max)
            System.out.println("Equal");
        else {
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }

    }
}
