import java.util.*;

// Step 1: Player class
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Step 2: Checker class implementing Comparator
class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        // First compare scores in descending order
        if (a.score != b.score) {
            return b.score - a.score; // higher score comes first
        } else {
            // If scores are equal, compare names in ascending order
            return a.name.compareTo(b.name);
        }
    }
}

// Step 3: Main method to read input, sort, and print
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of players

        Player[] players = new Player[n];
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players[i] = new Player(name, score);
        }

        // Sort using the Checker comparator
        Arrays.sort(players, new Checker());

        // Print the sorted players
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }

        sc.close();
    }
}
