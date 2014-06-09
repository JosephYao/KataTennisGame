package tennisgame;

public abstract class AbstractTennisGame {

	protected static final int FORTY = 3;
	protected static final String DELIMITER = " ";
	public static final int WINNER_POINT_WITHOUT_DEUCE = 4;
	protected int firstPlayerPoint = 0;
	protected int secondPlayerPoint = 0;

	private static final String[] pointText = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
	
	public abstract String score();

	protected String getTextFromPoint(int playerPoint) {
		return pointText[playerPoint];
	}

	public void firstPlayerGetOnePoint() {
		firstPlayerPoint += TennisGamePointValidator.getOnePoint(firstPlayerPoint, secondPlayerPoint);
	}

	public void secondPlayerGetOnePoint() {
		secondPlayerPoint += TennisGamePointValidator.getOnePoint(firstPlayerPoint, secondPlayerPoint);
	}

}
