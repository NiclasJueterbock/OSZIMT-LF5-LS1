import java.util.Scanner;

public class Rechteck {
    // create main
public static void main(String[] args) {
        //create the needed variables which are integers
        int laenge = 0;
        int breite = 0;
        int flaeche = 0;
        int umfang = 0;
        //create a scanner which is calles "tastatur"
        Scanner tastatur = new Scanner(System.in);
        //prints out "SeiteA (in cm):"
        System.out.print("SeiteA (in cm): ");
        //saves the input from the user in the variable "laenge"
        laenge = tastatur.nextInt();
        //prints out "SeiteB (in cm): "
        System.out.print("Seite B (in cm): ");
        //saves the input from the user in the variable "breite"
        breite = tastatur.nextInt();
        //adds the two numbers and overwrites the result into the variable "umfang"
        umfang = laenge + laenge + breite + breite;
        //prints out the result with its corresponding text
        System.out.println("\nUmfang: " + umfang + " cm");
        //multiplies the two numbers and saves the result in the variable "flaeche"
        flaeche = laenge * breite;
        //prints out the result with its corresponding text
        System.out.println("Fläche: " + flaeche + " cm²");
        //closes the scanner
        tastatur.close();
    }
}
