import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args)
    {


        int a,result = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose digits you want to calculate the sum of");
        a = input.nextInt();

        while(a != 0)
        {
            result +=  a % 10;
              a /=  10;
        }
            System.out.println(result);



    }
}

