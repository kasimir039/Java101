import java.util.Arrays;
import java.util.Scanner;

public class NearestNumber {

    static void nearestNumber(int[] arr,int number)
    {
        Arrays.sort(arr);

        int smallNumber = -1;
        int bigNumber = -1;

        for (int i : arr) {
            if (i < number) {
                smallNumber = i;
            }
        }

        for(int i : arr)
        {
            if (i > number) {
                bigNumber = i;
                break;
            }
        }

        System.out.println("Entered value " + number);
        System.out.println("Smallest nearest number " + smallNumber);
        System.out.println("Largest nearest number " + bigNumber);

    }


    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        nearestNumber(list,number);

    }

}