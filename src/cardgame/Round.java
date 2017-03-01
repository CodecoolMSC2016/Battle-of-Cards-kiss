package cardgame;

public class Round extends Dealer {
	CardComparator comp;

	public Round(Player player1, Player player2) {
		super(player1, player2);
		comp = new CardComparator();

	}

	public void round() {
		Dealer dealer = new Dealer(player1, player2);
		dealer.deal();
		int tempComp;
		for (int i = 0; i < player2.getHandOfPlayer().size(); i++) {
			System.out.println();
			tempComp = comp.compare(player1.getHandOfPlayer().get(i), player2.getHandOfPlayer().get(i));

			System.out.println((i + 1) + ".round:");
			System.out.println("Player1 card: " + player1.getHandOfPlayer().get(i) + "\nPlayer2 card: "
					+ player2.getHandOfPlayer().get(i));

			if (tempComp == 0) {
				System.out.println("Same parameter \n");
				continue;
			}
			if (tempComp > 0) {
				player1.setScore(1);
				System.out.println("Round won by Player1 \n");
				player1.showCard(i + 1);
			} else {
				player2.setScore(1);
				System.out.println("Round won by Player2 \n");
				player2.showCard(i + 1);
			}

		}
	}
}
