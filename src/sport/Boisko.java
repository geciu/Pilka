package sport;

import sprzet.PilkaDoSportu;
import sprzet.Pilka;

import javax.swing.*;
import java.awt.*;


public class Boisko {

    public enum materialy{Guma, Skora, Plastik, Tworzywo}

    public static void main (String args[]){

        PilkaDoSportu pilka = new PilkaDoSportu(20, materialy.Skora, 12);
        PilkaDoSportu pilka2 = new PilkaDoSportu(15, materialy.Guma, 15);

        pilka.aktualnaIloscPilek(2);

        pilka.wysokoscOdbicia(10);

        pilka2.wysokoscOdbicia(20);

        pilka.promien(5);
        pilka.wysokoscOdbicia(10);

        PilkaDoSportu pilka3 = new PilkaDoSportu(12, materialy.Tworzywo, 10);
        pilka.aktualnaIloscPilek(1);
        pilka3.promien(3);
        pilka.promien(5);

    }
}
