public class LogicOperations {

    /*
        - boolean este un tip de date primitiv, in timp ce Boolean este un tip de date wrapper
        - poate lua doar 2 forme de valoare: true sau false
        - simbolic, putem considera ca valorile codului binar reprezinta 1 pentru true, si 0 pentru false
        - scopul principal e de a stoca rezultate booleene in urma operatiilor logice/conditionale
     */

    public static void main(String[] args) {
        // Tipul de date boolean/Boolean
        boolean trueVar = true;
        boolean falseVar = false;
        System.out.println("Variabila mea de adevar este " + trueVar);
        System.out.println("Variabila mea de fals este " + falseVar);
        System.out.println("----------------------------------------------------------");

        // Operatorul de incrementare(++)/decrementare(--) - cei 2 operatori se numesc OPERATORI UNARI
        // pt decrementare principiu pre/post e acelasi
        int a = 5;
        int b = a++;    // post incrementare = operatia de crestere cu 1 se realizeaza DUPA executia instructiunii curente
        /*
            Desfasurat ar arata astfel:
            b = a;          -> b = 5
            a = a + 1;      -> a = 5 + 1 = 6    (reasignare prin adunare)
         */
        System.out.println("Post incrementare: " + a + " " + b);

        int c = 5;
        int d = ++c;    // pre incrementare = operatia de crestere cu 1 se realizeaza INAINTE de executia instructiunii curente
        /*
            Desfasurat ar arata astfel:
            c = c + 1;      -> c = 5 + 1 = 6    (reasignare prin adunare)
            d = c;          -> d = 6
         */
        System.out.println("Pre incrementare: " + c + " " + d);
        System.out.println("----------------------------------------------------------");

        // Operatii de asignare cu operator aritmetic
        float floatingOne = 19.45f;
        float floatingTwo = 4f; // instantierea presupune si asignarea unei valori

        float result;   // definirea presupune doar scrierea unei variabile/unui obiect sub tipul de date dorit
        result = 0;

        System.out.println("Valoarea originala era " + result);
        result += floatingOne;  // result = result + floatingOne = 0 + 19.45 = 19.45
        System.out.println("Valoarea reasignata prin adunare este " + result);

        result *= floatingTwo;
        System.out.println("Valoarea reasignata prin inmultire este " + result);

        // extrapolam pt toate celelalte -=, /=, %=

        System.out.println("----------------------------------------------------------");

        // Operatorii relationali/egalitate -> <, >, <=, >=, ==, !=
        boolean resultB;

        resultB = floatingOne > a;
        System.out.println(resultB);

        resultB = floatingTwo != 55;
        System.out.println(resultB);

        resultB = (a + b + c) > 99;
        System.out.println(resultB);

        resultB = 78 == floatingTwo;
        System.out.println(resultB);

        resultB = a + d <= floatingOne;
        System.out.println(resultB);
        System.out.println("----------------------------------------------------------");

        // Operatii conditionale -> instructiuni conditionale
        // instructiunea if = ne permite sa verificam valoarea de adevar a unei operatii
        // conditionale si sa decidem ce sa facem in functie de rezultat

        // instructiunea switch = este un comutator conditional intre o serie de scenarii

        // Sintaxa: if(conditie_booleana) { // ramura de adevar }
        // If doar cu o ramura de adevar si una de fals
        if (floatingOne >= (100 * floatingTwo)) {
            System.out.println("Am intrat in if-ul simplu pe ramura de adevar!");
        } else {
            System.out.println("Am intrat in if-ul simplu pe ramura de fals!");
        }

        // if cu mai multe ramuri de adevar alternativ si una default de fals
        if (a == 9) {
            System.out.println(a);
        } else if (a < 2) {
            System.out.println(a);
        } else if (a > 5) {
            System.out.println(a);
        } else {
            System.out.println(":(");
        }

        // if care inlantuieste operatii conditionale cu operatorii logici (&&, ||)
        if(floatingOne >= 10 && floatingOne < 20) {
            System.out.println("Se afla in interval!");
        }

        if(floatingOne >= 10 && floatingOne < 20 || floatingTwo == 3) {
            System.out.println("Se afla in interval!");
        }

        if(floatingOne >= 10 && (floatingOne > 20 || floatingTwo == 3)) {
            System.out.println("Se afla in interval!");
        }

        System.out.println("----------------------------------------------------------");

        // Switch = se foloseste de cele mai multe ori pt a verifica o egalitate multipla
        // Sintaxa: switch (variabila1) { case valoare1: ... \n case valoare2: ... \n case valoare3: ... \n deafult }

        switch((int) floatingTwo) {
            case 1:
                System.out.println("Extra small");
                break;
            case 2:
                System.out.println("Small");
                break;
            case 3:
                System.out.println("Medium");
                break;
            case 4:
                System.out.println("Large");
                break;
            case 5:
                System.out.println("Extra large");
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}

/*
    CTRL + ALT + L = format code
    CTRL + ALT + O = optimise imports
 */
