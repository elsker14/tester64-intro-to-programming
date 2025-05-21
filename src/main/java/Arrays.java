import java.util.Scanner;

public class Arrays {

    /*
    * Array este un mecanism de stocare a mai multor valori de acelasi tip.
    * Un array nu dispune de mecanisme dinamice de stocare a informatiilor.
    * Prin urmare, e nevoie sa plasam pe indexul fiecarei pozitii din array, valoarea citita.
    * In plus, suntem nevoiti sa citim si o limita maxima a numarului de elemente citit.
    * */

    public static void main(String[] args) {
        int myFirstArray[];     // declaratia unui array conform standardelor din C/C++
        int[] mySecondArray = new int[10];    // declaratia acreditata de Java

        Scanner inputReader = new Scanner(System.in);
        System.out.print("Introdu dimensiunea array-ului: ");
        int dim = inputReader.nextInt();    // dim trebuie sa fie maxim dimensiunea declarata arrayului
        myFirstArray = new int[dim];

        for(int i = 0; i < dim; i++) {
            mySecondArray[i] = inputReader.nextInt();
            myFirstArray[i] = mySecondArray[i];
        }

        System.out.println("Lista de valori citite e urmatoarea: ");
        for(int i = 0; i < dim; i++) {
            System.out.println(mySecondArray[i] + " " + myFirstArray[i]);
        }
    }
}
