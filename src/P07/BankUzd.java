package P07;

import java.util.Scanner;

public class BankUzd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IBan iban = new IBAN()

        while (true) {
            System.out.print("Iveskite IBAN :");


            String iban = scanner.nextLine();
            if (iban.length() == 0) break;

            boolean isValid = checkIBAN(iban);

            System.out.println("Jūsų Iban: " + iban + " " + isVAlid);
        }
    }
   // private static boolean checkIBAN(String iban) {
}
