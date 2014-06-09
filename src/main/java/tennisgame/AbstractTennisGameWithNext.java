package tennisgame;

public abstract class AbstractTennisGameWithNext extends AbstractTennisGame {

	private AbstractTennisGame next;
	private String firstPlayer;

	public AbstractTennisGameWithNext(String theFirstPlayer, AbstractTennisGame theNext) {
		firstPlayer = theFirstPlayer;
		next = theNext;
	}
	
	public String score() {
		if (match()) {
			return getScore();
		} else {
			return next.score();
		}
	}
	
	protected abstract String getScore();

	protected abstract boolean match();
	
	public void firstPlayerGetOnePoint() {
		super.firstPlayerGetOnePoint();
		next.firstPlayerGetOnePoint();
	}

	public void secondPlayerGetOnePoint() {
		super.secondPlayerGetOnePoint();
		next.secondPlayerGetOnePoint();
	}

	protected int getPlayerPoint(String player) {
		if (player.equals(firstPlayer)) {
			return firstPlayerPoint;
		} else {
			return secondPlayerPoint;
		}
	}

	protected int getAnotherPlayerPoint(String player) {
		if (player.equals(firstPlayer)) {
			return secondPlayerPoint;
		} else {
			return firstPlayerPoint;
		}
	}

}
