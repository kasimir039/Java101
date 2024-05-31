import java.util.Scanner;

public class RecursivePrime {


    static boolean isPrime(int number,int divisor){
        if(divisor == number){
            return true;
        }
        if(number % divisor == 0){
            return false;
        }
        return isPrime(number,divisor+1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = input.nextInt();


        boolean isPrimeResult = isPrime(userInput,2);

        if(isPrimeResult){
            System.out.println(userInput+" is a prime number.");
        }else{
            System.out.println(userInput+" is not a prime number.");
        }
    }
}
