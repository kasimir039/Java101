public class HarmonicArrays
{
    public static void main(String[] args) {

        double result = 0.0;

        int[] arr = {1,5,9,10,2,4};

        for(double i = 1; i <= arr.length;i++)
        {
            result += (1/i);

        }

        double average = arr.length / result;
        System.out.println("avarage: " + average);
    }
}
