package cardgame;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class CardComparator implements Comparator<Cars> {

	@Override
	public int compare(Cars player1Card, Cars player2Card) {
		String[] good = {"TopSpeed", "Weight", "Displacement", "Cylinder", "Acceleration"};
		String finalOption = "";
		while (!Arrays.asList(good).contains(finalOption))
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please Chose an option from the followings");
			System.out.println("TopSpeed, Weight, Displacement, Cylinder, Acceleration");
			String option = scan.nextLine();
			finalOption = option;
		}
		if (finalOption.equals("TopSpeed"))
		{
			return player1Card.tSpeed - player2Card.tSpeed;
		}
		else if (finalOption.equals("Weight"))
		{
			return player2Card.weight - player1Card.weight;
		}
		else if (finalOption.equals("Displacement"))
		{
			return player1Card.displacement - player2Card.displacement;
		}
		else if (finalOption.equals("Cylinder"))
		{
			return player1Card.cylinder - player2Card.cylinder;
		}
		else if (finalOption.equals("Acceleration"))
		{
			int returner = (int)Math.round((player2Card.acceleration - player1Card.acceleration));
			return returner;
		}
		
		return 0;
		
		
	}
}