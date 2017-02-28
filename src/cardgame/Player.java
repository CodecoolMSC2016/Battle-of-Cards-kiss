package cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Cars> handOfPlayer = new ArrayList<Cars>();

	public Player(List<Cars> handOfPlayer) {
		this.handOfPlayer = handOfPlayer;
	}
	
	public Player() {
	}
	
	public void addCard(Cars car) {
		handOfPlayer.add(car);
	}
	// Enum<?> e

	public List<Cars> getHandOfPlayer() {
		return handOfPlayer;
	}
}
