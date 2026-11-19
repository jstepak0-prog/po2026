package agh.po.symulator;

public class Pozycja {
    double x;
    double y;

    public Pozycja(double x, double y){
        this.x = x;
        this.y = y;
    }
    void aktualizujPozycję(double deltaX, double deltaY){
        this.x = x + deltaX;
        this.y = y + deltaY;
    }

    public String getPozycja(){
        return x + "," + y;
    }

}
