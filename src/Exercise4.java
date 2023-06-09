// INSERITA LA PAROLA " alphabet " (NOTARE SPAZI) COME INPUT IN UN METODO
// GENERA "alphabeT" COME OUTPUT

public class Exercise4 {
    public static void main(String[] args) {
        String input = " alphabet";
        String inputStrip = input.strip();
        String firstInputPart = inputStrip.substring(0, inputStrip.length() - 1);
        // UTILIZZO 'Character' PER AVERE ACCESSO AL METODO toString() DOPO
        Character lastInputLetter = inputStrip.charAt(inputStrip.length() - 1);
        System.out.println(firstInputPart + lastInputLetter.toString().toUpperCase());
    }
}
