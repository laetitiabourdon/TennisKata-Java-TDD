package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	public static final String LOVE_FIFTEEN = "Love-fifteen";
	public static final String FIFTEEN_LOVE = "Fifteen-love";
	public final static String LOVE_ALL = "Love-all";
	
	
	@Test
	public void scoresOfGamesIsNull()
	{
		TennisGame tennis = new TennisGame();
		tennis.startOfGame();
		assertEquals(tennis.getScores(), LOVE_ALL);
	}
	
	@Test
	public void thePlayer1ScoredPoints()
	{
		TennisGame tennis = new TennisGame();
		tennis.scoreOfPlayer1();
		assertEquals(tennis.getScores(), FIFTEEN_LOVE);
	}
	
	@Test
	public void thePlayer2ScoredPoints()
	{
		TennisGame tennis = new TennisGame();
		tennis.scoreOfPlayer2();
		assertEquals(tennis.getScores(), LOVE_FIFTEEN);
	}
	
	@Test 
	public void eachPlayerScoredPoint()
	{
		TennisGame tennis = new TennisGame();
		assertEquals(tennis.getScores(), "Fifteen-all");
	}

}
