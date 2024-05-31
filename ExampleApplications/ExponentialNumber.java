import java.util.Scanner;

class ExponentialNumber {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base number");
        int n = input.nextInt();

        System.out.println("Enter the number to be the exponent");
        int k = input.nextInt();

        int total = 1;

        for(int i = 1;i <= k;i++)
        {
            total *=  n;
        }
        System.out.println(total);


    }
}





