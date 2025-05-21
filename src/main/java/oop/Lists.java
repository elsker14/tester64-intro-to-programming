package oop;

/*
    Ce este o structura de date dinamica?
        Este un mecanism de colectare a informatiilor dupa diverse considerente, fara sa mai tinem cont de dimensiune sau memorie.
        In mod obligatoriu, tipul de date al obiectelor este o clasa de obiect/wrapper.

    Majoritatea structurilor de date generale sunt interfete (List, Set, Map..).
    Interfata este un tip special de clase care ne permite sa definim un contract comportamental.
    Un contract comportament reprezinta o lista de semnaturi de metode pe care le-ar putea intreprinde obiectul descris.
    Foarte important de inteles, faptul ca semnatura metodei nu are implementare, e finalizata cu inchiderea parantezei cu ;.

    Scopul unor interfete e de a seta un comportament general, care ulterior sa fie implementat de o serie de clase obiect.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Introdu dimensiunea listei: ");
        int dim = inputReader.nextInt();

        System.out.print("Introdu numerele: ");
        for(int i = 0; i < dim; i++) {
            doubleList.add(inputReader.nextDouble());
        }

        for (int i = 0; i < doubleList.size(); i++) {
            System.out.print(doubleList.get(i) + " ");
        }
        System.out.println("\n-------------------------------");

        List<Button> buttonList = new ArrayList<>();
        buttonList.add(new Button("rosu", 100));
        buttonList.add(new Button("albastru"));
        buttonList.add(new Button(98));

        for (int i = 0; i < buttonList.size(); i++) {
            String messageWhenClick = buttonList.get(i).click();
            System.out.println(messageWhenClick);

            buttonList.get(i).display();
        }
    }
}
