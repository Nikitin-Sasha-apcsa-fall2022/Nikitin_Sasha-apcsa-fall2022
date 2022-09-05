import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int temp = (int) Math.ceil(3*Math.random());
		 if(temp==1) compChoice = "R";
		 if(temp==2) compChoice = "P";
		 if (temp==3) compChoice = "S";
	}

	public String determineWinner()
	{
		String winner="";
		
		if(playChoice.equals("R") && compChoice == "P") winner = "computer";
		if(playChoice.equals("P") && compChoice == "S") winner = "computer";
		if(playChoice.equals("S") && compChoice =="R") winner = "computer";
		if((playChoice.equals("R") && compChoice =="R") || (playChoice.equals("P")&&compChoice=="P") || (playChoice.equals("S")&&compChoice=="S"))
				winner="draw";
		if(playChoice.equals("R")&&compChoice=="S") winner="player";
		if(playChoice.equals("P")&& compChoice == "R") winner="player";
		if(playChoice.equals("S")&&compChoice=="P")winner="player";
		return winner;
	}

	public String toString()
	{
		String output="player had " + playChoice + "\n" + "computer had "+ compChoice
				+ "\n" + determineWinner() + " wins!";
		return output;
	}
}