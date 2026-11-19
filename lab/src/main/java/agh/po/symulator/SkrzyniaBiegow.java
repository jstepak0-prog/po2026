package agh.po.symulator;

public class SkrzyniaBiegow {
    int aktualnyBieg;
    int iloscBiegow;

    void zwiekszBieg(){
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
        }
    }

    void zmniejszBieg(){
        if (aktualnyBieg > 0){
            aktualnyBieg--;
        }
    }
}
