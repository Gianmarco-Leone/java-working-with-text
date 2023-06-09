// ASSICURARSI CHE NON CI SIANO SPAZI INVOLONTARI ALL'INIZIO O ALLA FINE
// DELLA FRASE

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
//        SOLUZIONE STATICA
//        String errorText = "  ci sono spazi  ";
//        String correctText = errorText.strip();
//        System.out.println(correctText);

//        SOLUZIONE CON INSERIMENTO PAROLA DINAMICO
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().strip();
        System.out.printf("'%s'%n", userInput);
    }
}
