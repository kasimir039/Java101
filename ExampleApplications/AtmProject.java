import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Username :");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello and welcome to We Code Bank!");
                do {
                    System.out.println("1-Deposit money\n" +
                            "2-Withdraw money\n" +
                            "3-Inquire balance\n" +
                            "4-Exit");
                    System.out.print("Please select the action you want to perform : ");
                    select = input.nextInt();

                    switch (select)
                    {
                        case 1:
                            System.out.print("Amount of money: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Current amount of money: " + balance);
                            break;
                        case 2:
                            System.out.print("Amount of money: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                                System.out.println("Current amount of money: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Balance : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Account blocked, please contact the bank.");
                } else {
                    System.out.println("Your Remaining Rights : " + right);
                }
            }
        }


    }
}
