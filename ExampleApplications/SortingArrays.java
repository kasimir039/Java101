import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of the array");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(i+1 + ". element");
            int element = input.nextInt();

            arr[i] = element;
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
