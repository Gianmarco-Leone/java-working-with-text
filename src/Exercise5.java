// DATA LA STRINGA "12345 Big St., Alphabet City, CA 90210"
// SCRIVI CODICE PER STAMPARE:
// 1. The building number: 12345
// 2. The Street: “Big St.”
// 3. City: “Alphabet City”
// 4. State: “CA”
// 5. Postal Code: 90210

public class Exercise5 {
    public static void main(String[] args) {
        String address = "12345 Big St., Alphabet City, CA 90210";

//        Per recuperare il primo numero splitto la strg in array usando come divisore lo "spazio" e prendo solo il primo elemento dell'array
        String number = address.split(" ")[0];

        String street = parseStreet(address);
        String city = parseCity(address);
        String state = parseState(address);
        String postCode = parsePostCode(address);

        System.out.println(number);
        System.out.println(street);
        System.out.println(city);
        System.out.println(state);
        System.out.println(postCode);
    }

        //    MY FUNCTIONS    //

//    FUNZIONE PER RECUPERARE STREET
    public static String parseStreet(String address) {
//        Individuo il primo spazio come punto dopo il quale inizia la strg che mi serve
        int beforeStart = address.indexOf(" ");

//        Individuo la prima virgola come punto in cui finisce la strg che mi serve
        int afterEnd = address.indexOf(",");

        String street = address.substring(beforeStart  + 1, afterEnd);
        return street;
    }


//    FUNZIONE PER RECUPERARE CITY
    public static String parseCity(String address) {
//        Divido la strg in elementi di un array
        String[] myArray = address.split(",");
        String city = myArray[1].strip();
        return city;
    }


//    FUNZIONE PER RECUPERARE STATE
    public static String parseState(String address) {
//        Divido la strg in elementi di un array
        String[] myArray = address.split(",");
        String fullString = myArray[2].strip();
        String state = fullString.split(" ")[0];
        return state;
    }


//    FUNZIONE PER RECUPERARE POSTAL CODE
    public static String parsePostCode(String address) {
//        Divido la strg in elementi di un array
        String[] myArray = address.split(",");
        String fullString = myArray[2].strip();
        String postCode = fullString.split(" ")[1];
        return postCode;
    }

}
