import java.util.Scanner;

public class Rechner {
    // create main
    public static void main(String[] args) {
        // create the needed variables which are integers
        int zahl1 = 0;
        int zahl2 = 0;
        int ergebnis = 0;
        // create a scanner which is calles "tastatur"
        Scanner tastatur = new Scanner(System.in);
        // prints out "Geben Sie die erste Zahl ein:"
        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        // saves the input from the user in the variable "zahl1"
        zahl1 = tastatur.nextInt();
        // prints out "Geben Sie die zweite Zahl ein:"
        System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");
        // saves the input from the user in the variable "zahl2"
        zahl2 = tastatur.nextInt();
        // adds the two numbers and saves the result in the variable "ergebnis"
        ergebnis = zahl1 + zahl2;
        // prints out the result with its corresponding text
        System.out.println("\nSumme: " + ergebnis);
        //subtracts the two numbers and overwrites the result into the variable "ergebnis"
        ergebnis = zahl1 - zahl2;
        // prints out the result with its corresponding text
        System.out.println("\nDifferenz: " + ergebnis);
        // multiplies the two numbers and overwrites the result into the variable "ergebnis"
        ergebnis = zahl1 * zahl2;
        // prints out the result with its corresponding text
        System.out.println("\nProdukt: " + ergebnis);
        // divides the two numbers and overwrites the result into the variable "ergebnis"
        ergebnis = zahl1 / zahl2;
        // prints out the result with its corresponding text
        System.out.println("\nQuotient: " + ergebnis);
        // gets the modulo of the two numbers and overwrites the result into the variable "ergebnis"
        ergebnis = zahl1 % zahl2;
        // prints out the result with its corresponding text
        System.out.println("\nRest: " + ergebnis);
        // closes the scanner
        tastatur.close();
    }
}
