package agh.po.symulator;

public class Samochod {
    Silnik silnik;
    SkrzyniaBiegow skrzynia;

    void wlacz(){
        silnik.uruchom();
    }

    void wylacz(){
        silnik.zatrzymac();
    }
}
