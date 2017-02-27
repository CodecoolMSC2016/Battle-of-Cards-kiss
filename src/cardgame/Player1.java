package cardgame;

import java.util.ArrayList;
import java.util.Random;

public class Player1 implements Player {

	ArrayList<Cars> handOfPlayer1 = new ArrayList<Cars>();

	@Override
	public ArrayList<Cars> getCard() {
		for (int i = 0; i < 16; i++) {
			Random random = new Random();
			int n = random.nextInt(32) + 1;
			System.out.println(n);
			for (Cars cars : Cars.values()) {
				if (n == Cars.values()[cars].id) {
					handOfPlayer1.add(Cars.values()[n]);
				}
			}
			System.out.println(handOfPlayer1);
		}
		return handOfPlayer1;
	}
}
