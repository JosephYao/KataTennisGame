package tennisgame;

public class NormalTennisGame extends AbstractTennisGame {

	@Override
	public String score() {
		return  getTextFromPoint(firstPlayerPoint) + DELIMITER + getTextFromPoint(secondPlayerPoint);
	}

}
