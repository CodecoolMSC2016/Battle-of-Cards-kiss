package cardgame;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();

		Round round = new Round(player1, player2);
		round.round();

		System.out.format("Player 1 Score: %s %n", round.player1.getScore());
		System.out.format("Player 2 Score: %s", round.player2.getScore());

		if (round.player1.getScore() > round.player2.getScore()) {
			System.out.println("\n\nGame won by Player1!");
		} else if (round.player1.getScore() < round.player2.getScore()) {
			System.out.println("\n\nGame won by Player2!");
		} else {
			System.out.println("\n\nWin-Win!!");
		}

	}
}
