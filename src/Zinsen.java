import java.util.Scanner;

public class Zinsen {
    public static void main(String[] args) {
        //create the needed variables which are doubles
        double betrag = 0;
        double zinssatz = 0;
        double jahre = 0;
        double ergebnis = 0;
        //create a scanner which is calles "tastatur"
        Scanner tastatur = new Scanner(System.in);
        //prints out "Einzahlung in Euro:"
        System.out.print("Einzahlung in Euro: ");
        //saves the input from the user in the variable "betrag"
        betrag = tastatur.nextDouble();
        //prints out "Zinsen in Prozent:"
        System.out.print("Zinsen in Prozent: ");
        //saves the input from the user in the variable "zinssatz"
        zinssatz = tastatur.nextDouble();
        //prints out "Jahre:"
        System.out.print("Jahre: ");
        //saves the input from the user in the variable "jahre"
        jahre = tastatur.nextDouble();
        //adds the two numbers and saves the result in the variable "ergebnis"
        ergebnis = betrag * zinssatz / 100 * jahre;
        //prints out the result with its corresponding text
        System.out.println("\nDer investor hat insgesamt: " + ergebnis + " Euro erhalten");
        //print out compount interest
        System.out.println("Der investor hat insgesamt: " + (betrag * Math.pow(1 + zinssatz / 100, jahre) - betrag) + " Euro erhalten (mit Zinseszins)");
        //closes the scanner
        tastatur.close();
    }
}
