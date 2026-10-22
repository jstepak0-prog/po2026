import java.util.ArrayList;
import java.util.Random;

public class Lotto2 {
    public static void main(String[] args) {

        ArrayList<Integer> typy = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            int liczba = Integer.parseInt(args[i]);
            typy.add(liczba);
        }

        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();

        while (wylosowane.size() < 6) {
            int liczba1 = random.nextInt(49) + 1;
            if (!wylosowane.contains(liczba1)) {
                wylosowane.add(liczba1);
            }
        }

        int licznik_trafien = 0;

        for (int i = 0; i < typy.size(); i++) {
            int typ = typy.get(i);

            if (wylosowane.contains(typ)) {
                licznik_trafien++;
            }
        }

        System.out.println("typy: " + typy);
        System.out.println("wylosowane: " + wylosowane);
        System.out.println("trafienia: " + licznik_trafien);
    }
}