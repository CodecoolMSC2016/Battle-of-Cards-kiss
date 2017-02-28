package cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Cars> handOfPlayer = new ArrayList<Cars>();

	public void addCard(Cars car) {
		handOfPlayer.add(car);
	}

	public List<Cars> getHandOfPlayer() {
		return handOfPlayer;
	}
}
