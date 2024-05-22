import java.util.Scanner;

class HarmonicNumbers {


    public static void main(String[] args) {

        double result = 0.0;
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("N: ");
        n = input.nextInt();

        for(double i = 1; i <= n;i++)
        {
            result += (1/i);

        }
        System.out.println("result: " + result);

    }
}