import java.util.Scanner;


/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam
bölünen sayıların ortalamasını hesaplayan programı yazınız.*/

class Numbers {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number n");
        int n = input.nextInt();

        int i = 0;
        int total = 0;
        int count = 0;

        while(i <= n)
        {
            if((i % 3 == 0) && (i % 4 == 0))
            {
                total += i;
                count++;
            }
            i++;

        }

        if(count > 0)
        {
            double average = (double) total  / count;
            System.out.println("Average: " + average);
        }
    }
}

