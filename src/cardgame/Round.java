package cardgame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Round extends Dealer {
	CardComparator comp;
	
	public Round(Player player1, Player player2)
	{
		super(player1, player2);
		comp = new CardComparator();
		
	}
	
	
	private int counterPlayer1 = 0;
	private int counterPlayer2 = 0;
	
	public int getCounterPlayer1()
	{
		return counterPlayer1;
	}
	public void setCounterPlayer1(int number)
	{
		this.counterPlayer1 += number;
	}

	public int getCounterPlayer2()
	{
		return counterPlayer2;
	}
	public void setCounterPlayer2(int number)
	{
		this.counterPlayer2+= number;
	}

	public void round()
	{
		Dealer dealer = new Dealer(player1, player2);
		dealer.deal(); 
		int tempComp;
		for(int i = 0; i < player2.getHandOfPlayer().size(); i++)
		{	
			tempComp = comp.compare(player1.getHandOfPlayer().get(i), player2.getHandOfPlayer().get(i));
			
			if (tempComp == 0)
			{
				continue;
			}
			if (tempComp > 0)
			{
				setCounterPlayer1(1);
			}
			else
			{
				setCounterPlayer2(1);
			}
			
		}
	}	
	private void compare()
	{
		
	}
}
