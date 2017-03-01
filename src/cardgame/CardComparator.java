package cardgame;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class CardComparator implements Comparator<Car> {

	@Override
	public int compare(Car player1Card, Car player2Card) {
		String[] good = {"S", "W", "D", "C", "A", "s", "w", "d", "c", "a"};
		String finalOption = "";
		while (!Arrays.asList(good).contains(finalOption))
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please Chose an option from the followings");
			System.out.println(
							  "S = TopSpeed,"
							+ "W = Weight,"
							+ "D = Displacement,"
							+ "C = Cylinder,"
							+ "A = Acceleration");
			String option = scan.nextLine();
			finalOption = option.toLowerCase();
		}
		if (finalOption.equals("s"))
		{
			return player1Card.tSpeed - player2Card.tSpeed;
		}
		else if (finalOption.equals("w"))
		{
			return player2Card.weight - player1Card.weight;
		}
		else if (finalOption.equals("d"))
		{
			return player1Card.displacement - player2Card.displacement;
		}
		else if (finalOption.equals("c"))
		{
			return player1Card.cylinder - player2Card.cylinder;
		}
		else if (finalOption.equals("a"))
		{
			int returner = (int)Math.round((player2Card.acceleration - player1Card.acceleration));
			return returner;
		}
		
		return 0;
		
		
	}
}