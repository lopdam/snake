package lab1;

/**
Cambiar competario
 */
public class GameOverException extends Exception {
	private final int score;

	/** Constructs a new exception with the final score.
	 * 
	 * @param score The final score of the game.
	 */
	public GameOverException(final int score) {
		this.score = score;
	}

	/** Get the score of the game */
	public int getScore() {
		return this.score;
	}
}
