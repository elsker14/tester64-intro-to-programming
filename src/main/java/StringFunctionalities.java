public class StringFunctionalities {

    /*
        Sirul de caractere = reprezinta o colectie de caractere pe care o folosim sub forma unei variabile
        Caracterele nu sunt limitate doar la cifre sau litere, ci se refera la toate interpretarile digitale ale oricarui simbol cunoscut.
        De exemplu, cifre, litere, simboluri de punctuatie, caractere albe (space, enter, end line), etc..

        Toate caracterele in programare detin un cod numeric de identificare.
     */

    public static void main(String[] args) {
        char ch = 'o';  // tipul de date primitiv char stocheaza DOAR caractere singulare, prin urmare nu putem texte
        // char ch2 = 'asdaf'; -> genereaza eroare de tipul "Too many chars..."
        // tipul de date char poate fi initializat doar cu ghilimele simple

        System.out.println((int) ch);   // pentru a afla codul ascii decimal al oricarui caracter, doar convertim char la int

        String text1 = "j";
        String text2 = "Ana are mere";
        String text3 = "ananas";
        String text4 = "Imi place ciocolata \n Si mancarea chinezeasca!";
        // String text5 = 'i'; -> genereaza eroarea Incompatible Types, char nu se converteste prin asignare la String
        // String text6 = 'jbasbj' -> genereaza eroare de tipul "Too many chars..."

        // Diferenta majora intre un tip de date primitiv si unul wrapper, este aceea ca primitivul stocheaza VARIABILE,
        // in timp ce wrapperul stocheaza obiecte.
        // De aceea, tipul de date wrapper se comporta ca un invelis peste tipul de date primitiv si aduce in evidenta
        // conceptul de clasa obiect, care are atribute, constructori si comportament
        String obj1 = new String("j");
        String obj2 = new String("Ana are mere");
        String obj3 = new String("Ana are mere");
        String duplicateText3 = "ananas";

        // Greseala de comparatie a stringurilor
        boolean result;

        result = (text1 == obj1);           // "j" ? new String("j")
        System.out.println(result);         // false, pentru ca keywordul specific constructorilor 'new' instantiaza in memorie o noua adresa la care e stocat textul respectiv

        result = (text3 == duplicateText3); // "ananas" ? "ananas"
        System.out.println(result);         // true, pentru ca avand aceeasi valoare text, cele 2 variabile vor coincide la aceeasi adresa de memorie

        result = (obj2 == obj3);            // new String("Ana are mere") ? new String("Ana are mere")
        System.out.println(result);         // false, pentru ca chiar daca cele 2 obiecte au aceeasi valoare, ele sunt stocate la adrese diferite de memorie

        // Ce e o adresa de memorie? E pur si simplu un index de identificare unic pentru o informatie. Ele se scriu in sistem hexazecimal, de exemplu 0x14AF
        // 0x este o eticheta necesara memoriei pt a fi inteleasa de procesor, adresa propriu zisa e dupa -> 14AF
        System.out.println("----------------------------------------");

        /** Metode populare String */
        // Metodele unei clase de obiect pot fi accesate in 2 moduri
            // 1. prin instantierea unui obiect de tipul de date al clasei si folosirea acestuia ca intermediar (obj.method())
            // 2. prin definitia clasei, in cazul in care metoda este STATICA -> StringFunctionalities.staticMethod()
        // length() = numarul de caractere din string
        System.out.println("Lungimea stringului text4 este: " + text4.length());
        System.out.println("----------------------------------------");

        // isEmpty() = intoarce o valoare booleana in functie de lungimea sirului de caractere
        obj3 = new String("");
        System.out.println(obj2.isEmpty()); // length > 0 -> false
        System.out.println(obj3.isEmpty()); // length == 0 -> true
        System.out.println("----------------------------------------");

        // toLowerCase() si toUpperCase()
        System.out.println(obj2.toLowerCase()); // rezultatul e temporar in timpul unei afisari daca metoda e apelata direct
        System.out.println(obj2);

        System.out.println(text4);
        text4 = text4.toUpperCase();    // rezultatul e permanent daca metoda e apelata intr-o reasignare
        System.out.println(text4);
        System.out.println("----------------------------------------");

        // contains
        System.out.println(text3.contains("as"));   // as este in ananAS
        System.out.println(text3.contains("asa"));  // asa nu este in ananas

        // alte metode memorabile: indexOf(), lastIndexOf(), substring(), equals(), split(), replace(), concat(), join(), startsWith(), endsWith()

        /** CONSTANTE */

        // Sintaxa: final tip_de_date nume_constanta;
        // final = este un keyword care limiteaza asignarea unei valori la o variabila sau un obiect astfel incat sa nu poata fi modificata
        final double PI_CONST = 3.1415;
        // PI_CONST = 12; -> genereaza eroarea 'Cannot assign a value to final variable'
        // important de amintit e faptul ca o variabila sau un obiect constant se scriu exclusiv cu majuscule si despartite prin "_"

        final String SELECTOR_BUTTON_LOG_IN = "//div/div/div/button";
        // SELECTOR_BUTTON_LOG_IN = "new"; -> genereaza eroarea 'Cannot assign a value to final variable'
        // SELECTOR_BUTTON_LOG_IN = new String("new"); -> genereaza eroarea 'Cannot assign a value to final variable'
    }
}
