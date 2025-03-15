package lesson13;

import java.util.Arrays;
public class ComparatorApp {
    public static void main(String[] args) {
        Player p1 = new Player("Aysel", 50);
        Player p2 = new Player("Selim", 150);
        Player p3 = new Player("Aytac", 400);
        Player p4 = new Player("Nicat", 100);
        Player p5 = new Player("Leyla", 150);

        Player[] players = {p1, p2, p3, p4, p5};

        Checker checker = new Checker();
        Arrays.sort(players, checker);

        for (Player player : players) {
            System.out.println(player);
        }
    }
}
