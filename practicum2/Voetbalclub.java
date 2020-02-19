package OOP.practica.practicum2;

public class Voetbalclub {
    private int aantalGespeeld;
    private int aantalPunten;
    private String club;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String club) {
        this.club = club;


    }



    public int aantalGespeeld() {
        aantalGespeeld = aantalGewonnen + aantalGelijk + aantalVerloren;
        return aantalGespeeld;
    }

    public int aantalPunten() {
        aantalPunten = aantalGewonnen * 3 + aantalGelijk * 1;
        return aantalPunten;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;

    }

    public String toString() {
        return club + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();

    }
}

