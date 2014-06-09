package tennisgame;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestTennisGameWithDeuce {

	private AbstractTennisGame game;

	@Before public void createGameAndThenDeuce() {
		game = new TennisGame("Peter", "Mike");
		game.firstPlayerGetOnePoint();
		game.firstPlayerGetOnePoint();
		game.firstPlayerGetOnePoint();
		game.secondPlayerGetOnePoint();
		game.secondPlayerGetOnePoint();
		game.secondPlayerGetOnePoint();
	}
	
	@Test public void deuce() {
		assertScoreEquals("Deuce");
	}

	@Test public void deuce_Twice() {
		deuceAgain();

		assertScoreEquals("Deuce");
	}
	
	@Test public void first_Player_Advantage_After_Deuce() {
		firstPlayerAdvantage();
		
		assertScoreEquals("Peter Advantage");
	}
	
	@Test public void second_Player_Advantage_After_Deuce() {
		secondPlayerAdvantage();
		
		assertScoreEquals("Mike Advantage");
	}
	
	@Test public void first_Player_Advantage_After_Deuce_Twice() {
		deuceAgain();
		firstPlayerAdvantage();
		
		assertScoreEquals("Peter Advantage");
	}
	
	@Test public void first_Player_Win_After_Advantage_After_Deuce() {
		firstPlayerAdvantage();
		firstPlayerWin();
		
		assertScoreEquals("Peter Win");
	}
	
	@Test public void first_Player_Win_After_Advantage_After_Deuce_Twice() {
		deuceAgain();
		firstPlayerAdvantage();
		firstPlayerWin();
		
		assertScoreEquals("Peter Win");
	}
	
	@Test public void second_Player_Win_After_Advantage_After_Deuce() {
		secondPlayerAdvantage();
		secondPlayerWin();
		
		assertScoreEquals("Mike Win");
	}
	
	@Test public void second_Player_Win_After_Advantage_After_Deuce_Twice() {
		deuceAgain();
		secondPlayerAdvantage();
		secondPlayerWin();
		
		assertScoreEquals("Mike Win");
	}

	private void secondPlayerWin() {
		game.secondPlayerGetOnePoint();
	}

	private void firstPlayerWin() {
		game.firstPlayerGetOnePoint();
	}

	private void secondPlayerAdvantage() {
		game.secondPlayerGetOnePoint();
	}

	private void firstPlayerAdvantage() {
		game.firstPlayerGetOnePoint();
	}

	private void deuceAgain() {
		game.firstPlayerGetOnePoint();
		game.secondPlayerGetOnePoint();
	}
	
	private void assertScoreEquals(String expected) {
		assertEquals(expected, game.score());
	}

}
