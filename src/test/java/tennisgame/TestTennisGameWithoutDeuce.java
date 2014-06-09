package tennisgame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestTennisGameWithoutDeuce {

	AbstractTennisGame game = new TennisGame("Peter", "Mike");

	@Test public void new_Game() {
		assertScoreEquals("Love All");
	}

	@Test public void first_Player_Get_One_Point() {
		firstPlayerGetPoints(1);
		
		assertScoreEquals("Fifteen Love");
	}
	
	@Test public void second_Player_Get_One_Point() {
		secondPlayerGetPoints(1);
		
		assertScoreEquals("Love Fifteen");
	}
	
	@Test public void first_Player_Get_Two_Points() {
		firstPlayerGetPoints(2);
		
		assertScoreEquals("Thirty Love");
	}
	
	@Test public void first_Player_Get_Two_Points_And_Second_Player_Get_One_Point() {
		firstPlayerGetPoints(2);
		secondPlayerGetPoints(1);
		
		assertScoreEquals("Thirty Fifteen");
	}
	
	@Test public void second_Player_Get_Two_Points() {
		secondPlayerGetPoints(2);

		assertScoreEquals("Love Thirty");
	}
	
	@Test public void first_Player_Get_Three_Points() {
		firstPlayerGetPoints(3);
		
		assertScoreEquals("Forty Love");
	}
	
	@Test public void first_Player_And_Second_Player_Both_Get_One_Point() {
		firstPlayerGetPoints(1);
		secondPlayerGetPoints(1);
		
		assertScoreEquals("Fifteen All");
	}
	
	@Test public void first_Player_Win_By_Get_Four_Points() {
		firstPlayerGetPoints(4);
		
		assertScoreEquals("Peter Win");
	}
	
	@Test public void second_Player_Win_By_Get_Four_Points() {
		secondPlayerGetPoints(4);
		
		assertScoreEquals("Mike Win");
	}
	
	private void firstPlayerGetPoints(int num) {
		for (int i = 0; i < num; i++)
			game.firstPlayerGetOnePoint();
	}
	
	private void secondPlayerGetPoints(int num) {
		for (int i = 0; i < num; i++)
			game.secondPlayerGetOnePoint();
	}
	
	private void assertScoreEquals(String expected) {
		assertEquals(expected, game.score());
	}
	
}
