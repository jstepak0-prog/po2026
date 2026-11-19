package agh.po.symulator;

public class Silnik {
    int maxObroty;
    int obroty;

    public void uruchom(){
        this.obroty = 500;
    }

    public void zatrzymac(){
        this.obroty = 0;
    }
}
