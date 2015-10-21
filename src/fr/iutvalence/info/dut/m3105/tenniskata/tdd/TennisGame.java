package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	public static final String LOVE_FIFTEEN = "Love-fifteen";
	public static final String LOVE_ALL = "Love-all";
	public static final String FIFTEEN_LOVE = "Fifteen-love";
	
	private int scoreOfTeam1;
	private int scoreOfTeam2;
	private String score;
	
	
	public void startOfGame()
	{
		this.score = LOVE_ALL;
	}
	
	public void scoreOfPlayer1()
	{
		this.score = FIFTEEN_LOVE;
		
	}
	
	public String getScores()
	{
		return this.score;
	}

	public void scoreOfPlayer2()
	{
		this.score = LOVE_FIFTEEN;
		
	}
	
	
}
