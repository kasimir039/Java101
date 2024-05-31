import java.util.Scanner;

public class Combination {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int r = input.nextInt();

        int totalN = 1;
        int totalR = 1;
        int totalNR = 1;

        for (int i = 1; i <= n; i++) {
            totalN *= i;
            if (i <= r) {
                totalR *= i;
            }
            if (i <= (n - r)) {
                totalNR *= i;
            }
        }

        long combination = totalN / (totalR * totalNR);

        System.out.println("C(" + n + ", " + r + ") = " + combination);

    }
}
