package cardgame;

import java.util.Comparator;

public class CardComparator implements Comparator<Cars> {

	@Override
	public int compare(Cars player1Card, Cars player2Card) {

		return player1Card.tSpeed - player2Card.tSpeed;
	}
}