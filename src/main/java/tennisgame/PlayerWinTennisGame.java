package tennisgame;

public class PlayerWinTennisGame extends AbstractTennisGameWithNext {

	private String winner;

	public PlayerWinTennisGame(String theWinner, String theFirstPlayer, AbstractTennisGame theNext) {
		super(theFirstPlayer, theNext);
		winner = theWinner;
	}

	protected String getScore() {
		return winner + DELIMITER + "Win";
	}

	protected boolean match() {
		int winnerPoint = getPlayerPoint(winner);
		int loserPoint = getAnotherPlayerPoint(winner);
		return winnerPoint >= WINNER_POINT_WITHOUT_DEUCE && winnerPoint - loserPoint >= 2;
	}

}
