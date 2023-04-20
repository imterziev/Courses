package JavaAdvanced.DefiningClasses.Lab.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            String output = null;

            switch (command) {
                case "Create":
                    BankAccount account = new BankAccount();
                    bankAccounts.put(account.getId(), account);
                    output = String.format("Account ID%d created", account.getId());
                    break;
                case "Deposit":
                    int accountId = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);

                    if (bankAccounts.containsKey(accountId)) {
                        bankAccounts.get(accountId).deposit(amount);
                        output = String.format("Deposited %d to ID%d", amount, accountId);
                    } else {
                        output = "Account does not exist";
                    }
                    break;
                case "SetInterest":
                    double interestRate = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;
                case "GetInterest":
                    int idAccount = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);

                    if (bankAccounts.containsKey(idAccount)) {
                        double getInterestRate = bankAccounts.get(idAccount).getInterestRate(years);
                        output = String.format("%.2f", getInterestRate);
                    } else {
                        output = "Account does not exist";
                    }

                    break;
            }

            if (output != null) {
                System.out.println(output);
            }

            input = scanner.nextLine();
        }
    }
}