package cardgame;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cardgame.comparator.AccelerationComparator;
import cardgame.comparator.CylinderComparator;
import cardgame.comparator.DisplacementComparator;
import cardgame.comparator.SpeedComparator;
import cardgame.comparator.WeightComparator;

public class Game  {
	Player player1;
	Player player2;
	Comparator<Car> comparator;
	Map<String, Comparator<Car>> mComparators = new HashMap<>();

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void playGame() {
		Dealer dealer = new Dealer(player1, player2);
		dealer.deal();
		int tempComp;
		
		mComparators.put("s", new SpeedComparator());
		mComparators.put("w", new WeightComparator());
		mComparators.put("d", new DisplacementComparator());
		mComparators.put("c", new CylinderComparator());
		mComparators.put("a", new AccelerationComparator());
		
		readInput();
		
		for (int i = 0; i < player2.getHandOfPlayer().size(); i++) {
			System.out.println();
			tempComp = comparator.compare(player1.getHandOfPlayer().get(i), player2.getHandOfPlayer().get(i));

			System.out.println((i + 1) + ".round:");
			System.out.println("Player1 card: " + player1.getHandOfPlayer().get(i) + "\nPlayer2 card: "
					+ player2.getHandOfPlayer().get(i));

			if (tempComp == 0) {
				System.out.println("Same parameter \n");
				continue;
			}
			if (tempComp > 0) {
				player1.addScore();
				System.out.println("Round won by Player1 \n");
				if (i < 15) {
					player1.showCard(i + 1);
				}
			} else {
				player2.addScore();
				System.out.println("Round won by Player2 \n");
				if (i < 15) {
					player2.showCard(i + 1);
				}
			}
			readInput();
		}
	}
	
	public void readInput() {
		String input = "";
		String[] good = {"S", "W", "D", "C", "A", "s", "w", "d", "c", "a"};
		
		while (!Arrays.asList(good).contains(input)) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please Chose an option from the followings");
			System.out.println(
							  "S = TopSpeed,"
							+ "W = Weight,"
							+ "D = Displacement,"
							+ "C = Cylinder,"
							+ "A = Acceleration");
			String option = scan.nextLine();
			input = option.toLowerCase();
		}
		
		comparator = mComparators.get(input);
	}
	
	public void endGame(Player player1, Player player2) {
		System.out.format("Player 1 Score: %s %n", player1.getScore());
		System.out.format("Player 2 Score: %s", player2.getScore());

		if (player1.getScore() > player2.getScore()) {
			System.out.println("\n\nGame won by Player1!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("\n\nGame won by Player2!");
		} else {
			System.out.println("\n\nWin-Win!!");
		}
	}
}