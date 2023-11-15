import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] TeamA = new int[4];

        int[] TeamB = new int[4];

        TeamA[0] = scanner.nextInt();
        TeamB[0] = scanner.nextInt();
        TeamA[1] = scanner.nextInt();
        TeamB[1] = scanner.nextInt();
        TeamA[2] = scanner.nextInt();
        TeamB[2] = scanner.nextInt();
        TeamA[3] = scanner.nextInt();
        TeamB[3] = scanner.nextInt();

        int ScoreATeam = 0;
        for (int i = 0; i < TeamA.length; i++) {
            ScoreATeam += TeamA[i];
        }
        int ScoreBTeam = 0;
        for (int i = 0; i < TeamA.length; i++) {
            ScoreBTeam += TeamB[i];
        }

        if (ScoreATeam > ScoreBTeam) {
            System.out.println("1");
        } else if (ScoreBTeam > ScoreATeam) {
            System.out.println("2");
        } else {
            System.out.println("DRAW");
        }
    }
}