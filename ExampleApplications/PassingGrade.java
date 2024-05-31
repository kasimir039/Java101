import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PassingGrade
{
    public static void main(String[] args)
    {
        int math, physics , turkhis, chemistry, music ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Math grade:");
        math = input.nextInt();

        System.out.println("Enter your Physics grade:");
        physics = input.nextInt();

        System.out.println("Enter your Turkish note:");
        turkhis = input.nextInt();

        System.out.println("Enter your Chemistry grade:");
        chemistry = input.nextInt();

        System.out.println("Enter your Music note:");
        music = input.nextInt();


        int total = (math + physics + chemistry + turkhis + music);
        double average = total / 6.0;

        if(average >= 55 && average <= 100 && total <= 500 )
        {

           System.out.println("You passed the class |Average| =" + average);

        }
        else
        {

            System.out.println("You didn't pass the class");
        }

    }

}