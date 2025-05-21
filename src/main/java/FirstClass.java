public class FirstClass {

    // comentariu de linie
    /*
        bloc de comentarii

        Java = e un limbaj de programare orientat pe obiecte care are scopul de a folosi o serie de fisiere cu extensia java in a
        defini notiuni abstracte/palpabile din realitate

        Exista mai multe CATEGORII DE CLASE. O categorie de clasa are un singur scop bine definit -> Interface, Enum, Record, etc.
        (practic tot ce aparea in tabul de click dreapta -> new -> Java Class -> ORICE DE LA A DOUA VARIANTA IN JOS)

        Totodata, exceptie face clasa simpla, care poate avea mai multe scopuri in functie de o serie de contexte functionale.
        Un context functional reprezinta un scenariu de scriere a instructiunilor pt a rezolva un anumit task (sarcina/intentie)
        Pentru a crea o clasa simpla, principiu e acelasi, click dreapta -> new -> Java Class -> PRIMA VARIANTA

        JDK = Java Development Kit
        JRE = Java Runtime Environment
        JVM = Java Virtual Machine
        Compilatorul de JDK e un pachet de unelte de dezvoltare a codului in Java intr-un JRE.
        JRE este un mecanism care construieste un mediu virtual de rulare a programului in Java, prin urmare se foloseste de
        puterea hardware a sistemului indiferent de sistemul de operare.

        Organizarea directoarelor si fisierelor in Java se face sub forma de arbore. Avem o serie de directoare speciale,
        care au rolul de radacina pentru un anumit scop. Pornind de acolo, toate directoarele se vor numi PACHETE, iar
        continutul acestora va fi fie sub forma de alte pachete, fie fisiere java, denumite CLASE.

        Lucrul acesta se aplica strict pt directoarele java din main si test. Tot continutul din directoarele de resurse se numeste
        informatii statice, si de regula putem stoca fisiere cu diverse extensii (txt, csv, jpg, jpeg, png, xml, excel..)

        Reguli de scriere:
            - Capital Camel Case -> STRICT PENTRU CLASE, e un mecanism prin care definim denumirea unei clase cu litere mari la fiecare
            cuvant, astfel incat sa arate in felul urmator: FirstClass, UtilityClass, AdminFunctionsForWeb, etc
            - La finalul unei instructiuni care produce un efect sau un rezultat vom pune ';'
            - variabilele, obiectele sau metodele sunt scrise folosind CAMEL CASE, insa incepand cu litera mica, iar toate cuvintele urmatoare
            cu litere mari, de exemplu numberOne, resultOfOperation etc.
            - constantele se scriu exclusiv cu CAPITAL CASE si '_' intre cuvinte -> MAX_VALUE, MIN_VALUE, SELECTOR_FOR_SOMETHING etc

        Contexte de utilizare a unei clase simple:
            - clasa de rulare : e pur si simplu o clasa cu o metoda MAIN (prescurtarea de creere - psvm)
            - clasa de obiect: este o schita generala a unui obiect abstract sau fizic
                -- particularitati de creare: atribute, constructori, comportament
                -- prin intermediul claselor obiect putem defini obiecte astfel incat sa se comporte ca un tip de date
                -- sunt utilizate ca tipuri de date wrapper

        METODA = reprezinta o portiune de cod care indeplineste o sarcina
            -- fie e o metoda MAIN care ruleaza tot codul din interiorul acoladelor ei
            -- fie e o metoda creata de noi care executa o serie de comenzi linie cu linie
        - prima partea a metodei pana la acolade se numeste SEMNATURA -> public static void main()

        Ce reprezinta fiecare cuvant?
            - public : este un modificator de acces care permite continutului clasei sa fie vizibil de oriunde din proiect (din alte clase,
            din alte pachete etc)
            - static : este un keyword care limiteaza apartaneneta unei portiuni de cod la nivel de clasa, si nu de obiect
            - void : este un tip de date pentru metode care ne permite sa definim comportamentul ca un efect
            - main : reprezinta denumirea metodei, insa e colorat, fiindca in acelasi e si keyword
            - ce este intre paranteze de regula, se numesc ARGUMENTE - reprezinta niste informatii, venite din alte clase sau zone ale proiectului
            si sunt utilizate in executia codului pentru a produce diverse rezultate

       In java exista mai multe tipuri de informatii instantiabile:
       - variabile = sunt informatii singulare care apartin unui tip de date; pe parcursul unui program, ele isi pot schimba valoarea


       Tipuri de date:
            - primitive:
                -- numere intregi: int, long, byte, short
                -- numere reale: float, double
                -- siruri de caractere: char, String (hybrid)
            - wrapper:
                -- numere intregi: Integer, Long, Byte, Short   - clase de obiect
                -- numere realse: Float, Double
                -- siruri de caractere: Character, String (hybrid), StringBuffer, StringBuilder

     */

    public static void main(String[] args) {
        // Prescurtare pt metoda de afisare la consola -> sout
        System.out.println("Primul meu mesaj in Java!");
        System.out.println("Al doilea mesaj!");

        // Sintaxa definire variabila: tip_de_date nume_variabila;
        int integerNumberOne = 20;

        // Simbolul de + in contextul unei afisari, face concatenarea operatorilor sub forma unei propozitii
        // + este singurul simbol care poate face operatii cu stringuri
        System.out.println("Primul meu numar intreg este " + integerNumberOne);

        // Operatorii aritmetici sunt simbolurile pentru operatii matematice: +, -, *, /, %
        // Pentru operatia de impartire, programarea defineste 2 simboluri:
            // catul = se poate obtine cu /
            // restul = se poate obtine cu %
            // 20 / 7 = 2, catul este 2
            // 20 % 7 = 6, restul este 6

        int secondNumber = 7;
        System.out.println("Suma dintre " + integerNumberOne + " si " + secondNumber + " este " + (integerNumberOne + secondNumber));
        System.out.println("Diferenta dintre " + integerNumberOne + " si " + secondNumber + " este " + (integerNumberOne - secondNumber));
        System.out.println("Inmultirea dintre " + integerNumberOne + " si " + secondNumber + " este " + (integerNumberOne * secondNumber));
        System.out.println("Impartirea dintre " + integerNumberOne + " si " + secondNumber + " are catul " + (integerNumberOne / secondNumber));
        System.out.println("Impartirea dintre " + integerNumberOne + " si " + secondNumber + " are restul " + (integerNumberOne % secondNumber));


    }

}
