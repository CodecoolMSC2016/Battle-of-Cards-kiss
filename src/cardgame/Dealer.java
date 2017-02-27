package cardgame;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dealer {

	Player player1;
	Player player2;

	public Dealer(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public static void deal() {
		List<Cars> cards = Arrays.asList(Cars.values());
		Collections.shuffle(cards);
		boolean toPlayer1 = true;
		for (Cars cars : cards) {
			if (toPlayer1) {
				// player1.add cars;
			} else {
				// player2.add cars;
			}
			toPlayer1 = !toPlayer1;
		}
	}

	public static void main(String[] args) {
		deal();
	}
}
