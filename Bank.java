import java.util.Random;
import java.util.Scanner;

public class Bank {

    int balance;
    String acno;
    String cname;
    String actype;

    Scanner sc = new Scanner(System.in);

    
    public String getAcno() {
        Random r = new Random();
        int num = 1000 + r.nextInt(9000);
        acno = "hdfc" + num;
        return acno;
    }

    
    public void setBalance() {
        if (actype.equalsIgnoreCase("Saving")) {
            balance = 10000;
        } else if (actype.equalsIgnoreCase("Current")) {
            balance = 20000;
        } else {
            System.out.println("Invalid Account Type!");
            balance = 0;
        }
    }

    
    public void openAccount() {
        System.out.println("\n===== Open New Account =====");

        System.out.print("Enter Customer Name: ");
        cname = sc.nextLine();

        System.out.print("Enter Account Type (Saving/Current): ");
        actype = sc.nextLine();

        getAcno();
        setBalance();

        System.out.println("Account Created Successfully!");
        System.out.println("Generated Account Number: " + acno);
        System.out.println("Opening Balance: " + balance);
    }

    
    public void enquiryAccount() {
        System.out.println("\n===== Account Details =====");
        System.out.println("Account Number : " + acno);
        System.out.println("Customer Name  : " + cname);
        System.out.println("Account Type   : " + actype);
        System.out.println("Balance        : " + balance);
    }

    
    public void depositMoney() {
        System.out.print("Enter Deposit Amount: ");
        int amount = sc.nextInt();

        balance += amount;

        System.out.println("Deposit Successful.");
        System.out.println("Updated Balance: " + balance);
    }

    
    public void withdrawMoney() {
        System.out.print("Enter Withdrawal Amount: ");
        int amount = sc.nextInt();

        if (balance < amount) {
            System.out.println("Funds not available.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
            System.out.println("Updated Balance: " + balance);
        }
    }
}