package Practicum2B;

public class Voetbalclub {

    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int gespeeld;
    private int punten;
    private String naam;

    public Voetbalclub(String naam){
        this.naam = naam;
    }

    public int aantalGespeeld() {
        gespeeld = aantalGewonnen + aantalGelijk + aantalVerloren;
        return gespeeld;
    }

    public int aantalPunten() {
        punten = aantalGewonnen * 3 + aantalGelijk;
        return punten;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    @Override
    public String toString() {
        return naam + ' ' + aantalGespeeld() + ' ' + aantalGewonnen +
                ' ' + aantalGelijk + ' ' + aantalVerloren + ' ' + aantalPunten();
    }
}