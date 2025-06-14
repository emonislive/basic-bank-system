import java.util.Scanner;

public class BasicBankSystem {
    static Scanner scanner = new Scanner(System.in);
    double savingsMoney = 0; // global variable

    public void showBalance() {
        System.out.println("$1.00 has been charged for showing balance.");
        savingsMoney--;
        System.out.printf("Your Current balance is: $%.2f\n", savingsMoney);
    }
    public void depositMoney() {
        double deposit;
        System.out.print("Enter the amount you want to Deposit: ");
        deposit = scanner.nextDouble();
        if (deposit < 1) {
            System.out.println("The amount can't be negative or zero. Try Again!!");
            return;
        }
        savingsMoney += deposit;
        System.out.printf("$%.2f successfully deposited to your bank account.\n", deposit);
    }
    public void withdrawMoney() {
        double withdrawal;
        System.out.print("Enter the amount you want to Withdraw: ");
        withdrawal = scanner.nextDouble();
        if (withdrawal < 1) {
            System.out.println("The amount can't be negative or zero. Try Again!!");
            return;
        }
        if (withdrawal > savingsMoney) {
            System.out.println("Insufficient Balance. Try again after deposit sufficient balance.");
            return;
        }
        if (withdrawal < 100) {
            System.out.println("You cannot withdraw less than $100\nTry Again!");
            return;
        }
        savingsMoney -= withdrawal + (withdrawal * 0.005);
        System.out.println("Successfully $" + withdrawal + " Withdrawal Completed");
        System.out.println("0.5% charge on withdrawal has been added : $" + (withdrawal * 0.005));

    }
    public void checkHistory() {
        // TODO: features adding soon..
    }
    public void rulesRegulations() {
        System.out.println("Rule 1: $1.00 will be Charged for checking balance status\nRule 2: Deposit any amount is free of charge\nRule 3: Any withdrawal amount will be charged 0.5% of the amount that is to be withdraw\n");
    }
    public static void main (String[] args) {
        int choice;
        boolean programRunning = true;

        BasicBankSystem access = new BasicBankSystem();
        while (programRunning) {
            System.out.println("*****************");
            System.out.println(" BANKING PROGRAM ");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check History of The Transactions");
            System.out.println("5. Rules Regulations");
            System.out.println("6. Exit");
            System.out.println("*****************");
            System.out.println("Enter your choice (1-6): ");
            choice = scanner.nextInt();
            while (choice > 6 || choice < 1) { // TODO: add non INTEGER value Exception
                System.out.println("Wrong input!!, Try Again!");
                System.out.println("Enter your choice (1-6): ");
                choice = scanner.nextInt();
            }
            switch (choice) {
                case 1 -> access.showBalance();
                case 2 -> access.depositMoney();
                case 3 -> access.withdrawMoney();
                case 4 -> access.checkHistory(); // TODO: in the function add a array that stores string as the transaction history also add the time and date
                case 5 -> access.rulesRegulations();
                case 6 ->  {
                    System.out.println("Thank you for using our service. Have a nice day!! (^_^)..");
                    scanner.close();
                    programRunning = false;
                }
            }
        }

    }
}
