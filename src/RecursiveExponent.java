import java.util.Scanner;

public class RecursiveExponent {

    static int power(int base,int exp)
    {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {

        int result = power(2, 3);
        System.out.println(result);

    }

}
