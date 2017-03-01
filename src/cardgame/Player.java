package cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Cars> handOfPlayer = new ArrayList<Cars>();
	private int score = 0;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score += score;
	}

	public void addCard(Cars car) {
		handOfPlayer.add(car);
	}

	public List<Cars> getHandOfPlayer() {
		return handOfPlayer;
	}
}
