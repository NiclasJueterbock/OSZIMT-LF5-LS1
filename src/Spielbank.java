import java.util.Scanner;

public class Spielbank {
    // create main
    public static void main(String[] args) {
        // create the needed variables which are integers
        int fuenf = 0;
        int zehn = 0;
        int zwanzig = 0;
        int fuenfzig = 0;
        int hundert = 0;
        int ergebnis = 0;
        // create a scanner which is calles "tastatur"
        Scanner tastatur = new Scanner(System.in);
        // prints out "Anzahl an 5 Euro Chips:"
        System.out.print("Anzahl an 5 Euro Chips: ");
        // saves the input from the user in the variable "fuenf"
        fuenf = tastatur.nextInt();
        // prints out "Anzahl an 10 Euro Chips:"
        System.out.print("Anzahl an 10 Euro Chips: ");
        // saves the input from the user in the variable "zehn"
        zehn = tastatur.nextInt();
        // prints out "Anzahl an 20 Euro Chips:"
        System.out.print("Anzahl an 20 Euro Chips: ");
        // saves the input from the user in the variable "zwanzig"
        zwanzig = tastatur.nextInt();
        // prints out "Anzahl an 50 Euro Chips:"
        System.out.print("Anzahl an 50 Euro Chips: ");
        // saves the input from the user in the variable "fuenfzig"
        fuenfzig = tastatur.nextInt();
        // prints out "Anzahl an 100 Euro Chips:"
        System.out.print("Anzahl an 100 Euro Chips:  ");
        // saves the input from the user in the variable "hundert"
        hundert = tastatur.nextInt();
        // adds the two numbers and saves the result in the variable "ergebnis"
        ergebnis = fuenf * 5 + zehn * 10 + zwanzig * 20 + fuenfzig * 50 + hundert * 100;
        // prints out the result with its corresponding text
        System.out.println("\nIhr Auszahlungsbetrag beträgt: " + ergebnis + " Euro");
    }
}

