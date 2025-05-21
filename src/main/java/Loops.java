import java.util.Scanner;

public class Loops {

    /*
        CTRL + ALT + L = format code
        CTRL + ALT + O = optimise imports

        Instructiuni repetitive:
        - scopul principal al instructiunilor repetitive este de a elemina redundanta duplicarii codului
        - astfel, ne dorim sa generalizam si sa modularizam codul pe cat se poate de mult
        - o repetitie printr o instructiune repetitiva se numeste ITERATIE
        - instructiunile repetitive in ordinea importantei sunt: for, while si do while
        - Sintaxa for: for(tip_de_date_iterator nume_iterator = limita_inferioara; nume_iterator < limita_superioara; nume_iterator++)
            -- iteratorul de cele mai multe ori este o variabila intreaga
            -- intotdeauna SE PORNESTE CU ITERATIILE DE LA 0 pana la LIMITA SUPERIOARA - 1 (in cazul unei parcurgeri crescatoare)
        - Sintaxa while: while(conditie_booleana) { // cod + conditie de avansare a repetitiilor }
        - Sintaxa do while: do { //cod + conditie de avansare } while(conditie_booleana)

        Ce este o conditie de avansare?
            Reprezinta un mecanism definit in cod pentru a avansa de la o etapa la alta cu iteratiile.
            In caz contrar, am putea ramane blocat intr-un ciclu infinit.
    */

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);   // pentru a citi de la tastatura e nevoie de un obiect de tipul Scanner
        // care pe baza constructorului de initializare sa identifice flow-ul de date de unde sa citeasca
        // System.in = citirea de la tastatura in consola cand rulam

        // Citire de la tastatura dupa definirea variabilei prin asignare
        System.out.print("Introdu primul numar: ");
        int nr1;
        nr1 = inputReader.nextInt();

        System.out.print("Introdu al doilea numar: ");
        int nr2 = inputReader.nextInt();
        System.out.println();

        // for(tip_de_date_iterator nume_iterator = limita_inferioara; nume_iterator < limita_superioara; nume_iterator++)
        /* For crescator prin incrementare */
        for (int i = 0; i < nr1; i++) { // i++ <=> i = i + 1
            System.out.println("Iteratia ASC cu indexul " + i);
        }
        /* Ordinea de executie a unui for:
            - se initializeaza iteratorul -> int i = 0
            - se face verificarea conditionala -> i < nr1 -> 0 < nr1 -> true (presupunand ca nr1 e nenul)
            - i ramane constant pana se termina iteratia for-ului, prin urmare i = 0
            - se executa iteratia cu codul dintre acolade
            - odata ce s-a executat codul dinte acolade, se face cresterea lui i, si devine i = 1

            -- SE REIA PROCESUL --

            - se initializeaza iteratorul -> int i = 1
            - se face verificarea conditionala -> i < nr1 -> 1 < nr1 -> true (presupunand ca nr1 e nenul)
            - i ramane constant pana se termina iteratia for-ului, prin urmare i = 1
            - se executa iteratia cu codul dintre acolade
            - odata ce s-a executat codul dinte acolade, se face cresterea lui i, si devine i = 2

            -- SE REIA PROCESUL PANA CAND i < nr1 -> false --
            Se va intampla acest lucru cand i = nr1.
            */
        System.out.println("-----------------------");

        /* For descrescator prin decrementare */
        for (int i = nr1 - 1; i >= 0; i--) {    // i-- <=> i = i - 1
            System.out.println("Interatia DESC cu indexul " + i);
        }
        System.out.println("-----------------------");

        /* For prin alfabet */
        for (char ch = 'A'; ch <= 'z'; ch++) {  // ch++ <=> ch = ch + 1 <=> ch += 1
            System.out.println("Litera " + ch + " cu indexul decimal ASCII " + (int) ch);
        }
        System.out.println("-----------------------");

        // un for cu iterator caracter functioneaza conform tabelului ascii
        // chiar daca noi specificam litera de la care sa inceapa si la care sa se opreasca, in spate, for-ul functioneaza
        // folosind indexul decimal al fiecarui caracter

        /* For cu pas mai mare */
        for (int i = 0; i < nr2; i += 2) {  // i += 2 <=> i = i + 2
            System.out.println("Iteratia para cu indexul " + i);
        }
        System.out.println("-----------------------");

        /* For fara conditie de limita */
        for (int i = 0; ; i++) {
            System.out.println("Iteratia fara conditie are indexul " + i);
            if (i == nr2) {
                break;
            }
        }
        System.out.println("-------------------------");

        /* For fara conditie si fara instructiune de avansare de limita */
        for (int i = 0; ;) {
            System.out.println("Iteratia fara conditie are indexul " + i);
            if (i == nr2) {
                break;
            } else {
                i++;
            }
        }

        // memorabil de mentionat: while, do while
    }
}
