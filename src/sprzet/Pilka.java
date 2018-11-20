package sprzet;

public abstract class Pilka {

    protected int promien;
    private int liczbaUtworzonychPilek = 0;


    Pilka(int promien){
        this.promien=promien;
        liczbaUtworzonychPilek++;                   //liczba utworzonych piłek się zwiększa
    }



    public  void aktualnaIloscPilek(){
        liczbaUtworzonychPilek++;                   //bez tego mielibyśmy na odpowiedzi cały czas jedynkę
        System.out.println("Aktualna ilosc utworzonych pilek: " + liczbaUtworzonychPilek);
    }



    public abstract int wysokoscOdbicia(float wysokoscPoczatkowa);

}
