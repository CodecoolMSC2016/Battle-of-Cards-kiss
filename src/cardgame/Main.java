package cardgame;

public class Main {
	public static void main(String[] args) {
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		Dealer dealer = new Dealer(player1, player2);
		dealer.deal();
		
		System.out.println(player1.getHandOfPlayer());
		
		System.out.println(player2.getHandOfPlayer());
	}
}
