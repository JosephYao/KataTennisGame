package tennisgame;

import org.junit.Before;
import org.junit.Test;


public class TestTennisGameErrorHandlingWithDeuce {

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
	
	@Test(expected=IllegalStateException.class)
	public void first_Player_Get_One_Invalid_Point_After_Win_After_Deuce() {
		firstPlayerWin();
		
		firstPlayerGetOneInvalidPoint();
	}

	@Test(expected=IllegalStateException.class)
	public void first_Player_Get_One_Invalid_Point_After_Win_After_Deuce_Twice() {
		deuceAgain();
		firstPlayerWin();
		
		firstPlayerGetOneInvalidPoint();
	}
	
	@Test(expected=IllegalStateException.class)
	public void first_Player_Get_One_Invalid_Point_After_Second_Player_Win_After_Deuce() {
		secondPlayerWin();
		
		firstPlayerGetOneInvalidPoint();
	}

	private void secondPlayerWin() {
		game.secondPlayerGetOnePoint();
		game.secondPlayerGetOnePoint();
	}

	private void deuceAgain() {
		game.firstPlayerGetOnePoint();
		game.secondPlayerGetOnePoint();
	}
	
	private void firstPlayerWin() {
		game.firstPlayerGetOnePoint();
		game.firstPlayerGetOnePoint();
	}

	private void firstPlayerGetOneInvalidPoint() {
		game.firstPlayerGetOnePoint();
	}

}
