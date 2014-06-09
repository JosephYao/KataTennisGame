package tennisgame;

public class TennisGame extends AbstractTennisGameWithNext {

	public TennisGame(String theFirstPlayer, String theSecondPlayer) {
		super(theFirstPlayer,
				new DeuceTennisGame(theFirstPlayer, 
				new SamePointTennisGame(theFirstPlayer,
				new PlayerAdvantageTennisGame(theFirstPlayer, theFirstPlayer,
				new PlayerAdvantageTennisGame(theSecondPlayer, theFirstPlayer,
				new PlayerWinTennisGame(theFirstPlayer, theFirstPlayer, 
				new PlayerWinTennisGame(theSecondPlayer, theFirstPlayer, 
				new NormalTennisGame())))))));
	}

	protected boolean match() {
		return false;
	}
	
	protected String getScore() {
		throw new UnsupportedOperationException();
	}
	
}
