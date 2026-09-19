import java.util.Scanner;

public class MultiCustomerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank[] bank = new Bank[50];
        int count = 0;

        int choice;
        int exit;

        do {

            System.out.println("\n========== BANK MANAGEMENT SYSTEM ==========");
            System.out.println("1. Open Account");
            System.out.println("2. Show Details (Account Enquiry)");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 50) {
                        bank[count] = new Bank();
                        bank[count].openAccount();
                        count++;
                    } else {
                        System.out.println("Maximum Accounts Reached!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String acc1 = sc.next();

                    boolean found1 = false;

                    for (int i = 0; i < count; i++) {
                        if (bank[i].acno.equalsIgnoreCase(acc1)) {
                            bank[i].enquiryAccount();
                            found1 = true;
                            break;
                        }
                    }

                    if (!found1) {
                        System.out.println("Account no. not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String acc2 = sc.next();

                    boolean found2 = false;

                    for (int i = 0; i < count; i++) {
                        if (bank[i].acno.equalsIgnoreCase(acc2)) {
                            bank[i].depositMoney();
                            found2 = true;
                            break;
                        }
                    }

                    if (!found2) {
                        System.out.println("Account no. not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String acc3 = sc.next();

                    boolean found3 = false;

                    for (int i = 0; i < count; i++) {
                        if (bank[i].acno.equalsIgnoreCase(acc3)) {
                            bank[i].withdrawMoney();
                            found3 = true;
                            break;
                        }
                    }

                    if (!found3) {
                        System.out.println("Account no. not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for Using Bank Management System.");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }

            System.out.print("\nDo you still want to continue... Press 1 to exit, 2 to continue: ");
            exit = sc.nextInt();

        } while (exit != 1);

        System.out.println("Program Ended.");
    }
}
