import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();

        while (wylosowane.size() < 6) {

            int liczba = random.nextInt(49) + 1;

            if (!wylosowane.contains(liczba)) {
                wylosowane.add(liczba);
            }
        }

        System.out.println(wylosowane);
    }
}
