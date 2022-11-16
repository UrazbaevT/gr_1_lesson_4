import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>(3);
        colour.add("Red");
        colour.add("Green");
        colour.add("Black");
        colour.ensureCapacity(6);
        colour.add("White");
        colour.add("Pink");
        System.out.println(colour);
        Collections.reverse(colour);
        System.out.println(colour);
        Collections.sort(colour);
        Collections.reverse(colour);
        System.out.println(colour);

        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Alex", 20);
        Player player2 = new Player("Max", 28);
        Player player3 = new Player("Alen", 27);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        System.out.println(players);
        System.out.println("--------------------------------");
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }
        System.out.println("--------------------------------");
        for (Player player: players) {
            System.out.println(player);
        }
        System.out.println("--------------------------------");

        players.sort(Comparator.comparing(Player::getNumber));
        System.out.println(players);
    }
}