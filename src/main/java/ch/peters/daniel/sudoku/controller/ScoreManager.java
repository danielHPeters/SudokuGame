package ch.peters.daniel.sudoku.controller;

import ch.peters.daniel.sudoku.models.Score;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages scores.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class ScoreManager {
  private List<Score> scores;
  private DatabaseConnection connector;

  public ScoreManager(DatabaseConnection connector) {
    this.scores = new ArrayList<>();
    this.connector = connector;
  }

  public void submitScore(String name, long time) {
    this.scores.add(new Score(name, time));
  }

  public void submitToDb(String userName, long usedTime) throws SQLException {
    this.connector.connect();
    var conn = this.connector.getConnection();
    var sql = "INSERT INTO scores (userName, usedTime) VALUES(?, ?)";
    var statement = conn.prepareStatement(sql);

    statement.setString(1, userName);
    statement.setLong(2, usedTime);
    statement.executeUpdate();
  }


  /**
   * Load scoresList from database.
   *
   * @throws SQLException
   */
  public void loadScoresFromDb() throws SQLException {
    this.connector.connect();
    this.scores.clear();
    var conn = this.connector.getConnection();
    var sql = "SELECT userName, usedTime FROM scores ORDER BY usedTime";
    var statement = conn.prepareStatement(sql);
    var results = statement.executeQuery();

    while (results.next()) {
      this.scores.add(new Score(results.getString("userName"), results.getLong("usedTime")));
    }


  }

  public List<Score> getScores() {
    return scores;
  }
}
