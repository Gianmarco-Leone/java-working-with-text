// SCRIVI IL CODICE CHE SOSTITUISCE LA PAROLA "gatto" CON LA PAROLA "cane" OVUNQUE SI TROVI LA FRASE


public class Exercise2 {
    public static void main(String[] args) {
        String text = "Vorrei tanto avere un gatto";
        System.out.println(myReplace(text));
    }

    public static String myReplace(String text) {
        return text.replace("gatto", "cane");
    }

}
