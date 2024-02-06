import java.util.*;

public class MiniAtm {
    public static void main(String[] args) {
        int balance = 10000;
        int pin = 1234;

        int addAmount = 0;
        int takeAmount = 0;

        String name;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your PIN  : ");
        int password = input.nextInt();

        if (password == pin) {
            System.out.println("=================================");
            System.out.print("Enter Your Name  : ");
            name = input.next();
            System.out.println("Welcome!!! " + name);

            while (true) {
                System.out.println("Press 1 for Check your Balance ");
                System.out.println("Press 2 for To Add Amount ");
                System.out.println("Press 3 for withdraw Amount");
                System.out.println("Press 4 for Print Receipt ");
                System.out.println("Press 5 for Exit");
                System.out.print("Enter Your Option  :  ");
                int opt = input.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("=================================");
                        System.out.println("Your Bank Balance  : " + balance);
                        System.out.println("=================================");
                        break;
                    case 2:
                        System.out.println("===================================");
                        System.out.print("Enter the Amount You want to Deposit :");
                        addAmount = input.nextInt();
                        balance = balance + addAmount;
                        System.out.println("Your Total Balance is " + balance);
                        System.out.println("=================================");
                        break;
                    case 3:
                        System.out.println("=================================");
                        System.out.print("Enter the Amount You want to withdraw :");
                        takeAmount = input.nextInt();
                        if (takeAmount > balance) {
                            System.out.println("Insufficient Balance.... Please Enter the sufficient Amount");
                            break;
                        } else {
                            balance = balance - takeAmount;
                            System.out.println("Your Total Balance is " + balance);
                            System.out.println("=================================");
                            break;
                        }
                    case 4:
                        System.out.println("=================================");
                        System.out.println("Welcome to MiniAtm's Receipt ");
                        System.out.println("Your Current Balance is :  " + balance);
                        System.out.println("Your Deposited Amount  :  " + addAmount);
                        System.out.println("Your withdrawn Amount  : " + takeAmount);
                        System.out.println("=================================");
                        break;
                    default:
                        System.out.println("=================================");
                        System.out.println("Please enter the option below 5");
                        System.out.println("=================================");
                        break;
                }
                if(opt == 5){
                        System.out.println("=================================");
                        System.out.println("Thanks to use MiniAtm");
                        System.out.println("You are Exited....");
                        System.out.println("=================================");
                        break;
                }
            }
        }else{
            System.out.println("Your Pin is incorrect");
        }

    }
}
