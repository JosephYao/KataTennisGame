package tennisgame;

public class SamePointTennisGame extends AbstractTennisGameWithNext {

	public SamePointTennisGame(String theFirstPlayer, AbstractTennisGame theNext) {
		super(theFirstPlayer, theNext);
	}
	
	protected String getScore() {
		return getTextFromPoint(firstPlayerPoint) + DELIMITER + "All";
	}

	protected boolean match() {
		return firstPlayerPoint == secondPlayerPoint;
	}

}
