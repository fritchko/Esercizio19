import java.util.Scanner;

/**
 * Autore: Davide Francesco Riccio
 * Questa è la classe primaria dell'esercizio, chiamata WordGames.
 * Contiene due metodi: uno che prende come input una parola per
 * poi stamparla e aggiungere "Hello" prima della parola. L'altro
 * Prende come input nome e cognome e li stampa insieme.
 */
public class WordGames {
        Scanner input = new Scanner(System.in);

    /**
     *  Il metodo addHelloWord, prende una parola per poi stamparla,
     *  aggiungendo "Hello" prima.
     * @word input che verrà stampato dopo Hello.
     */
    void addHelloWord(){
        System.out.println("Enter word: ");
        String word = input.nextLine();
        System.out.println("Hello " + word);
    }


    /**
     * Il metodo getFullName prende due input (nome e cognome)
     * e li stampa insieme.
     * @name il nome della persona.
     * @surname il cognome della persona.
     */
    void getFullName(){
        System.out.println("Insert your name: ");
        String name = input.nextLine();
        System.out.println("\n Insert your surname: ");
        String surname = input.nextLine();
        System.out.println(name + " " + surname);
    }

}
