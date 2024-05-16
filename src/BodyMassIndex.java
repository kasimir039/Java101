import java.util.Scanner;

public class BodyMassIndex
{
    public static void main(String[] args)
    {
        double height,weight;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height:");
        height = input.nextDouble();

        System.out.println("Enter your weight:");
        weight = input.nextDouble();

        double result = weight / (height * height);

        System.out.println("Your Body Mass Index: " + result);

    }
}
