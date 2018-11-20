package sprzet;

public abstract class Pilka {

    protected int promien;
    private int liczbaUtworzonychPilek = 0;


    Pilka(int promien){
        this.promien=promien;
        liczbaUtworzonychPilek++;
    }



    public  void aktualnaIloscPilek(int n){
        n = liczbaUtworzonychPilek;
        System.out.println("Aktualna ilosc utworzonych pilek: " + liczbaUtworzonychPilek);
    }



    public abstract int wysokoscOdbicia(float wysokoscPoczatkowa);

}
