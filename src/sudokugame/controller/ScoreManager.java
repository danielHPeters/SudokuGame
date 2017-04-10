package sudokugame.controller;

import sudokugame.models.Score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Daniel on 27.03.2017.
 */
public class ScoreManager {

    /**
     *
     */
    private List<Score> scores;

    /**
     *
     */
    private DatabaseConnection connector;

    /**
     * @param connector
     */
    public ScoreManager(DatabaseConnection connector) {
        this.connector = connector;
    }

    /**
     * @param name
     * @param time
     */
    public void submitScore(String name, long time) throws SQLException {
        this.scores.add(new Score(name, time));

        this.connector.connect();
        Connection conn = this.connector.getConnection();

        String sql = "INSERT INTO scores (name, time) VALUES(?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, name);
        statement.setLong(2, time);

        System.out.println(statement.toString());
        statement.executeUpdate();

    }


    public void getAllHighScores() {

    }

    /**
     * @return
     */
    public List<Score> getScores() {
        return scores;
    }

    /**
     * @param scores
     */
    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
