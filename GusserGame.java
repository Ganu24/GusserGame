simport java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly get the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
	
}
class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly get the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
	
}

class Umpire
{
	int numFromGusser;
	int numFromPlayer;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGusser=g.guessNum();
		
	}
	void collectnumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	
	void compare()
	{
		if(numFromGusser==numFromPlayer1)
		{
			if(numFromGusser==numFromPlayer2 && numFromGusser==numFromPlayer3)
			{
				System.out.println("All player won the match");
			}
			else if(numFromGusser==numFromPlayer2)
			{
				System.out.println("Player 1 & Player 2 won the match");
				
			}
			else if(numFromGusser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player 3 won the match");
			}
			System.out.println("Player1 won the match");
		}
			
		else if(numFromGusser==numFromPlayer2)
		{
			if(numFromGusser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player 3 won the match");
			}
			System.out.println("Player2 won the match");
		}
			
		else if(numFromGusser==numFromPlayer3)
		{
			System.out.println("Player3 won the match");
		}
			
		else
		{
			System.out.println("lost the match");
		}
			
			
		
	}
	
	
}

public class GusserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectnumFromPlayer();
		u.compare();

	}

}
