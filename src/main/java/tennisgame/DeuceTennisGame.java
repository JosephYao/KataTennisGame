package tennisgame;

public class DeuceTennisGame extends AbstractTennisGameWithNext {

	public DeuceTennisGame(String theFirstPlayer, AbstractTennisGame theNext) {
		super(theFirstPlayer, theNext);
	}

	protected String getScore() {
		return "Deuce";
	}

	protected boolean match() {
		return firstPlayerPoint >= FORTY && (firstPlayerPoint == secondPlayerPoint);
	}

}
