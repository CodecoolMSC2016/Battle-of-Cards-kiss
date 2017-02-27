package cardgame;

import java.util.ArrayList;

public class Player2 implements Player {

	ArrayList<Cars> handOfPlayer2 = new ArrayList<Cars>();

	@Override
	public ArrayList<Cars> getCard() {
		Player1 player1 = new Player1();

		for (Cars cars : Cars.values()) {
			handOfPlayer2.add(cars);
		}

		for (Cars car : player1.handOfPlayer1) {
			if (handOfPlayer2.contains(car)) {
				handOfPlayer2.remove(car);
			}

		}
		System.out.println(handOfPlayer2.toString());
		return handOfPlayer2;
	}

}
