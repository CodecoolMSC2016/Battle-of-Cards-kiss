package cardgame;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Round round = new Round(player1, player2);
		round.round();
		System.out.format("Player 1 Score: %s %n" ,round.getCounterPlayer1());
		System.out.format("Player 2 Score: %s" ,round.getCounterPlayer2());
	}
}
