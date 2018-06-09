package ch.peters.daniel.sudoku.models;

/**
 * Score data class.
 *
 * @author Daniel peters
 * @version 1.0
 */
public class Score {
  private String player;
  private long time;

  public Score(String player, long time) {
    this.player = player;
    this.time = time;
  }

  public String getPlayer() {
    return player;
  }

  public long getTime() {
    return time;
  }
}
