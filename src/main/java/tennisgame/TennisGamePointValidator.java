package tennisgame;

public class TennisGamePointValidator {

	private static final int DIFFERENCE_POINT_BETWEEN_WINNER_AND_LOSER_WITH_DEUCE = 2;
	private static final int HIGHEST_LOSER_POINT_WITHOUT_DEUCE = 2;

	private static boolean isGameInWinStateByPlayerWithoutDeuce(int winnerPoint,
			int loserPoint) {
				return winnerPoint == AbstractTennisGame.WINNER_POINT_WITHOUT_DEUCE && loserPoint <= HIGHEST_LOSER_POINT_WITHOUT_DEUCE;
			}

	private static boolean isGameInWinState(int firstPlayerPoint, int secondPlayerPoint) {
		return isGameInWinStateByPlayerWithoutDeuce(firstPlayerPoint, secondPlayerPoint) ||
			isGameInWinStateByPlayerWithoutDeuce(secondPlayerPoint, firstPlayerPoint) || 
			isGameInWinStateByPlayerWithDeuce(firstPlayerPoint, secondPlayerPoint) ||
			isGameInWinStateByPlayerWithDeuce(secondPlayerPoint, firstPlayerPoint);
	}

	public static int getOnePoint(int firstPlayerPoint, int secondPlayerPoint) {
		if (isGameInWinState(firstPlayerPoint, secondPlayerPoint)) {
			throw new IllegalStateException();
		} else {
			return 1;
		}		
	}

	private static boolean isGameInWinStateByPlayerWithDeuce(int winnerPoint, int loserPoint) {
		return winnerPoint > AbstractTennisGame.WINNER_POINT_WITHOUT_DEUCE && winnerPoint - loserPoint == DIFFERENCE_POINT_BETWEEN_WINNER_AND_LOSER_WITH_DEUCE;
	}
	
}
