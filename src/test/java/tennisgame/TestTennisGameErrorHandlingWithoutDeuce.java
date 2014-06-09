package tennisgame;

import org.junit.Test;


public class TestTennisGameErrorHandlingWithoutDeuce {

	AbstractTennisGame game = new TennisGame("Peter", "Mike");

	@Test(expected=IllegalStateException.class)
	public void first_Player_Get_One_Invalid_Point_After_Win_By_Four_Points() {
		firstPlayerWin();
		
		firstPlayerGetOneInvalidPoint();
	}

	@Test(expected=IllegalStateException.class)
	public void second_Player_Get_One_Invalid_Point_After_Win_By_Four_Points() {
		secondPlayerWin();

		secondPlayerGetOneInvalidPoint();
	}
	
	@Test(expected=IllegalStateException.class)
	public void first_Player_Get_One_Invalid_Point_After_Win_By_Four_Points_And_Second_Player_Get_One_Point() {
		secondPlayerGetPoints(1);
		firstPlayerWin();
		
		firstPlayerGetOneInvalidPoint();
	}

	@Test(expected=IllegalStateException.class)
	public void first_Player_Get_One_Invalid_Point_After_Win_By_Four_Points_And_Second_Player_Get_Two_Points() {
		secondPlayerGetPoints(2);
		firstPlayerWin();
		
		firstPlayerGetOneInvalidPoint();
	}

	@Test(expected=IllegalStateException.class)
	public void first_Player_Get_One_Invalid_Point_After_Second_Player_Win_By_Four_Points() {
		secondPlayerWin();
		
		firstPlayerGetOneInvalidPoint();
	}

	@Test(expected=IllegalStateException.class)
	public void second_Player_Get_One_Invalid_Point_After_First_Player_Win_By_Four_Points() {
		firstPlayerWin();
		
		secondPlayerGetOneInvalidPoint();
	}
	
	private void secondPlayerGetPoints(int num) {
		for (int i = 0; i < num; i++)
			game.secondPlayerGetOnePoint();
	}

	private void secondPlayerGetOneInvalidPoint() {
		game.secondPlayerGetOnePoint();
	}

	private void secondPlayerWin() {
		game.secondPlayerGetOnePoint();
		game.secondPlayerGetOnePoint();
		game.secondPlayerGetOnePoint();
		game.secondPlayerGetOnePoint();
	}
	
	private void firstPlayerGetOneInvalidPoint() {
		game.firstPlayerGetOnePoint();
	}

	private void firstPlayerWin() {
		game.firstPlayerGetOnePoint();
		game.firstPlayerGetOnePoint();
		game.firstPlayerGetOnePoint();
		game.firstPlayerGetOnePoint();
	}
	
}
