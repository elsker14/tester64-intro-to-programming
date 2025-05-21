package oop;

// Clasa de obiect este o clasa simpla care aduna informatii despre un anumit obiect, fie el abstract sau fizic.
// Informatiile pot fi
    //  atribute (caracteristici ale obiectului, de exemplu dimensiune, culoare, marime, tip, nume etc)
    //  constructori (modalitatea prin care construim obiectele pe baza atributelor, ca un fel de matrite/schite)
    // comportamentul (reprezinta functionalitatile obiectului)

public class Button {
    // attributes
    String culoare;
    int dimensiune;

    // constructors - sunt de 2 tipuri
        // - Constructorul default:
            // -- este mereu unul singur
            // -- este neparametrizat
            // -- are scopul de a seta atributele la niste valori standard
            // -- nu e obligatoriu de scris, el este oricum creat de compiler in background cand rulam
    public Button() {
        this.culoare = "insert colour";
        this.dimensiune = -1;
    }

        // - Constructorul parametrizat:
            // -- putem avea o infinitate in functie de cate combinatii intre atribute putem face
            // -- e parametrizat folosind atributele clasei
            // -- nu se vor genera in mod automat la rulare, ci trebuie scrisi de noi

    // this = este un pointer care indica catre atributele clasei de definitie
    public Button(String culoare, int dimensiune) {
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    public Button(String culoare) {
        this.culoare = culoare;
        this.dimensiune = -1;
    }

    public Button(int dimensiune) {
        this.culoare = "";
        this.dimensiune = dimensiune;
    }

    // behaviour - exista 2 tipuri de metode:
    public String click() {
        // Ce este o metoda returnabila?
            // Este o metoda care returneaza un rezultat specific in urma apelarii. Rezultatul MEREU va avea tipul de date al metodei.

        // pot aparea orice fel de prelucrari de cod
        return "You clicked!";
    }

    public void display() {
        // Ce este o metoda void?
            // Este o metoda care produce un efect, de exemplu o citire, o afisare, o sortare, etc

        // pot aparea orice fel de prelucrari de cod
        System.out.println("Butonul este de culoare " + this.culoare +
                " si dimensiune " + this.dimensiune);
    }
}
