package tennisgame;

public class PlayerAdvantageTennisGame extends AbstractTennisGameWithNext {

	private static final int ADVANTAGE_DIFFERENCE_POINT = 1;
	private String advantager;

	public PlayerAdvantageTennisGame(String theAdvantager, String theFirstPlayer, AbstractTennisGame theNext) {
		super(theFirstPlayer, theNext);
		advantager = theAdvantager;
	}

	protected String getScore() {
		return advantager + DELIMITER + "Advantage";
	}

	protected boolean match() {
		int advantagerPoint = getPlayerPoint(advantager);
		int anotherPlayerPoint = getAnotherPlayerPoint(advantager);
		return advantagerPoint >= WINNER_POINT_WITHOUT_DEUCE && advantagerPoint - anotherPlayerPoint == ADVANTAGE_DIFFERENCE_POINT;
	}

}
