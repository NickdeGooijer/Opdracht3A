package OOP.practica.practicum2;

public class Zwembad {
    private double lengte;
    private double diepte;
    private double breedte;

    public Zwembad(double lengte, double diepte, double breedte){
        this.lengte = lengte;
        this.diepte = diepte;
        this.breedte = breedte;
    }

    public Zwembad() {
    }

    public double getBreedte() {
        return breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setBreedte(double b) {
        breedte = b;
    }

    public void setDiepte(double d) {
        diepte = d;
    }

    public void setLengte(double l) {
        lengte = l;
    }

    public double inhoud() {
        double inhoud = lengte * breedte * diepte;
        return inhoud;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en "
                + diepte + " meter diep.";
    }
}
