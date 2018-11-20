package sport;

import sprzet.PilkaDoSportu;
import sprzet.Pilka;

import javax.swing.*;
import java.awt.*;


public class Boisko {

    public enum materialy{Guma, Skora, Plastik, Tworzywo}

    public static void main (String args[]){

        PilkaDoSportu pilka1 = new PilkaDoSportu(20, materialy.Skora, 12);
        PilkaDoSportu pilka2 = new PilkaDoSportu(15, materialy.Guma, 15);

        pilka1.aktualnaIloscPilek();                                //metoda zwracająca aktualną ilość utworzonych piłek

        System.out.println(" ");
        pilka1.wysokoscOdbicia(10);
        pilka2.wysokoscOdbicia(20);
        System.out.println(" ");

        pilka1.promien(5);                                       //zmiana promienia dla piłki nr 1 (nowy promien = 5+20)
        pilka1.wysokoscOdbicia(10);               //wysokosc odbica obliczona dla nowego promienia, musimy podac wysokosc początkową
        System.out.println(" ");

        PilkaDoSportu pilka3 = new PilkaDoSportu(12, materialy.Tworzywo, 10);
        pilka1.aktualnaIloscPilek();                                //zliczana jest kolejna pilka, w sumie trzecia
        pilka3.promien(3);                                      //zmiana promiania dla pilki nr 3 (3+12=15)


    }
}
