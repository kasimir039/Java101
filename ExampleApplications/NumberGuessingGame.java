import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);
        int right = 3;
        int choice;
        int[] arr = new int[right];
        int index = 0;
        Scanner input = new Scanner(System.in);


        System.out.println(number);

        while(right > 0)
        {
            System.out.print("Enter number-> ");
            choice = input.nextInt();

            arr[index] = choice;
            index++;
            right--;

            if(choice == number)
            {
                System.out.println("Number found ->" + number);
                break;
            }else {
                if(choice > number)
                {
                    System.out.println("The number is lower");

                }
                if(choice < number)
                {
                    System.out.println("The number is higher");

                }
            }

            System.out.println("Remaining right-> " + right);

        }

        System.out.println("Right to guess is over Number -> " + number);

        System.out.println("Your predictions-> " + Arrays.toString( arr));

    }
}
