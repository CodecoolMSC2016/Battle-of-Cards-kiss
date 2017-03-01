package cardgame;
import java.util.Scanner; 

import java.util.Comparator;

public class CardComparator implements Comparator<Cars> {

	@Override
	public int compare(Cars player1Card, Cars player2Card) {
		String[] good = {"TopSpeed", "Weight", "Displacement", "Cylinder", "Acceleration"};
		boolean goodInput = false;
		String finalOption = "";
		while (goodInput == false)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please Chose an option from the followings");
			System.out.println("TopSpeed, Weight, Displacement, Cylinder, Acceleration");
			String option = scan.nextLine();
			if (good.)
			{
				
			}
		}
		if (finalOption.equals("TopSpeed"))
		{
			return player1Card.tSpeed - player2Card.tSpeed;
		}
		else if (finalOption.equals("Weight"))
		{
			return player2Card.weight - player1Card.weight;
		}
		return 0;
		
		
	}
}