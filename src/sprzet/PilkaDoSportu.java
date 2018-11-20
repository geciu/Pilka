package sprzet;
import sport.Boisko;

public class PilkaDoSportu extends Pilka {

    float wspSprezystosci;
    float wynik;


    public PilkaDoSportu(int promien, Boisko.materialy materialy, float wspSprezystosci) {
        super(promien);
        this.wspSprezystosci=wspSprezystosci;
        System.out.println("Promien: " + promien + ", materiał: " + materialy + ", współczynnik sprężystości: " + wspSprezystosci);
    }


    public void promien(int n){
        promien += n;
        System.out.println("Nowy promien = " + promien);
    }

    @Override
    public int wysokoscOdbicia(float wysokoscPoczatkowa) {
        wynik=wysokoscPoczatkowa*promien*wspSprezystosci;
        System.out.println("Wysokosc odbicia dla pilki o promieniu " + promien + " wynosi " + wynik);
        return 0;
    }
}
