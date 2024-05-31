import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("n1: " );
        int n1 = input.nextInt();

        System.out.print("n2: " );
        int n2 = input.nextInt();

        int gcd,lcm;
        int i = n1;

        while(i >= 1)
        {
            if(n1 % i == 0 && n2 % i == 0)
            {
                gcd = i;
                System.out.println("Gcd: " + gcd);
                break;
            }
            i--;
        }

        int k = 1;
        while(k <= (n1 * n2))
        {
            if(k % n1 == 0 && k % n2 == 0)
            {
                lcm = k;
                System.out.println("Lcm: " + lcm);
                break;
            }
            k++;
        }


    }
}
