import java.util.Scanner;


class Main {

    public static void main(String[] args) {

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;


        while (right > 0) {
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter your Username  : ");

            userName = input.nextLine();
            System.out.print("Please enter your  Password : ");

            password = input.nextLine();


            if (userName.equals("patika") && (password.equals("dev123"))) {
                System.out.println(" WELCOME,BANK OF SAMET.");
                do {
                    System.out.println("1-Deposit\n " +
                            "2-WITHDRAW\n" +
                            "3-BALANCE\n" +
                            "4-SIGN OUT ");
                    System.out.println("Please, select an option.");
                    select = input.nextInt();

                    int newPrice;


                    switch (select) {
                        case 1:
                            System.out.print(" Please, enter the amount of money for the deposit : ");
                            newPrice = input.nextInt();


                            balance += newPrice;
                            break;

                        case 2:
                            System.out.print("Please, enter the amount of money for the withdraw : ");
                            newPrice = input.nextInt();
                            if (newPrice <= balance) {
                                balance -= newPrice;


                            } else {
                                System.out.println("The balance is Inadequate in the bank account !");
                            }

                            break;
                        case 3:
                            System.out.println("Your balance  : " + balance);
                            break;
                        default:

                    }


                } while (select != 4);

                System.out.println("We hope to see you again soon .");


                break;
            } else {
                right--;

                if (right == 0) {
                    System.out.println("The account is blocked, please contact your bank.!");


                } else {
                    System.out.println("Your Username or Password is Wrong, Please try again !");

                    System.out.println("The Remaining right : " + right);
                }


            }


        }


    }


}

