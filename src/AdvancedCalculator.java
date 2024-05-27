import java.util.Scanner;

public class AdvancedCalculator {

    static void Addition()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    static void Subtraction()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    static void Multiplication()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);

    }

    static void Division()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
    }

    static void Exponentiation()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = input.nextInt();
        System.out.print("Enter exponent value: ");
        int exponent  = input.nextInt();
        int result = 1;

        for(int i = 1; i <= exponent ;i++)
        {
            result *= base;
        }

        System.out.println(base + " ^ " + exponent  + " = " + result);

    }

    static void Factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void Mode()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int result = a % b;

        System.out.println(a + " % " + b  + " = " + result);
    }

    static void Rectangle()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Perimeter: " + (2 * (a + b)));
        System.out.println("Area: " + (a * b));

    }


    public static void main(String[] args) {

        String menu = """
                      1- Addition
                      2- Subtraction
                      3- Multiplication
                      4- Division
                      5- Exponent Number Calculation
                      6- Factorial Calculation
                      7- Getting a Mode
                      8- Rectangular Area and Perimeter Calculation
                      0- Exit
                      """;

        System.out.println(menu);

        Scanner input = new Scanner(System.in);

        int select;

        do {

            System.out.print("\nPlease select an action: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    Exponentiation();
                    break;
                case 6:
                    Factorial();
                case 7:
                    Mode();
                case 8:
                    Rectangle();
                    break;
                case 0:
                    System.out.println("--Successfully logged out--");
                    break;
            }
        } while (select != 0);


    }


}

