import java.util.Scanner;


public class RecursiveNumberReduction {

    static void Reduce(int n)
    {

        System.out.println(n);

        if(n <= 0)
        {
            return;

        }
        else {
            Reduce(n -5);

        }

        System.out.println(n);

    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Reduce(n);

    }
}
