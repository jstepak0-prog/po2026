import java.util.ArrayList;
import java.util.Random;

public class Lotto3 {
    public static void main(String[] args) {

        ArrayList<Integer> typy = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            int liczba = Integer.parseInt(args[i]);
            typy.add(liczba);
        }

        int liczba_losowan = 0;
        boolean czy_szesc = false;
        Random random = new Random();

        long czas_start = System.currentTimeMillis();


        while(!czy_szesc){
            liczba_losowan++;

            ArrayList<Integer> wylosowane = new ArrayList<>();

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

            if (licznik_trafien == 6){
                czy_szesc = true;
                long czas_end = System.currentTimeMillis();
                long czas_trwania = czas_end - czas_start;
                System.out.println("typy: " + typy);
                System.out.println("wylosowane: " + wylosowane);
                System.out.println("trafienia: " + licznik_trafien);
                System.out.println("czas trwania: " + czas_trwania);
                System.out.println("liczba losowan: " + liczba_losowan);

            }


        }




    }
}
