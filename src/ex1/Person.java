package ex1;

// MODELLA UNA PERSONA CON NOME E COGNOME E ASSICURATI CHE
// ANCHE SE IL NOME VIENE INSERITO IN MINUSCOLO VERRA' SALVATO IN MAIUSCOLO
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase(); // IN QUESTO MODO SARA' SEMPRE MAIUSCOLO
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
