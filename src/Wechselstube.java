import java.util.Scanner;

public class Wechselstube {
   //create main
    public static void main(String[] args) {
        //create the needed variables which are integers
        int euro = 0;
        int cent = 0;
        int ergebnis = 0;
        //create a scanner which is calles "tastatur"
        Scanner tastatur = new Scanner(System.in);
        //prints out "ie viel Euro haben Sie?"
        System.out.print("Wie viel Euro haben Sie? ");
        //saves the input from the user in the variable "euro"
        euro = tastatur.nextInt();
        //prints out "Wie viel Cent haben Sie?"
        System.out.print("Wie viel Cent haben Sie? ");
        //saves the input from the user in the variable "cent"
        cent = tastatur.nextInt();
        //adds the two numbers and saves the result in the variable "ergebnis"
        ergebnis = euro * 100 + cent;
        //prints out the result with its corresponding text
        System.out.println("\nSie bekommen: " + ergebnis + " Cent als");
        //prints out the result with its corresponding text
        System.out.println(ergebnis / 200 + " 2-Euro Münzen");
        //prints out the result with its corresponding text
        System.out.println(ergebnis % 200 / 100 + " 1-Euro Münzen");
        //prints out the result with its corresponding text
        System.out.println(ergebnis % 200 % 100 / 50 + " 50-Cent Münzen");
        //prints out the result with its corresponding text
        System.out.println(ergebnis % 200 % 100 % 50 / 20 + " 20-Cent Münzen");
        //prints out the result with its corresponding text
        System.out.println(ergebnis % 200 % 100 % 50 % 20 / 10 + " 10-Cent Münzen");
        //prints out the result with its corresponding text
        System.out.println(ergebnis % 200 % 100 % 50 % 20 % 10 / 5 + " 5-Cent Münzen");
        //prints out the result with its corresponding text
        System.out.println(ergebnis % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " 2-Cent Münzen");
        //prints out the result with its corresponding text
        System.out.println(ergebnis % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " 1-Cent Münzen");
    }
}
