import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int n1,n2, select;
        boolean flag = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        n1 = input.nextInt();

        System.out.println("Enter the second number");
        n2 = input.nextInt();

        System.out.println("Select action \n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
        select = input.nextInt();


      switch (select)
      {
          case 1:
              System.out.println("Result: n1 + n2 = " + (n1 + n2));
              break;
          case 2:
              System.out.println("Result: n1 - n2 = " + (n1 - n2));
              break;
          case 3:
              System.out.println("Result: n1 * n2 = " + (n1 * n2));
              break;
          case 4:
              System.out.println("Result: n1 / n2 = " + (n1 / n2));
              break;
          default:
              System.out.println("Wrong choice");
      }
    }
}
