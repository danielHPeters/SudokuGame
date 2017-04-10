package sudokugame.controller;

import sudokugame.models.Score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public void submitScore(String name, long time) {
        this.scores.add(new Score(name, time));
    }

    /**
     * @param userName
     * @param usedTime
     * @throws SQLException
     */
    public void submitToDb(String userName, long usedTime) throws SQLException {
        this.connector.connect();
        Connection conn = this.connector.getConnection();

        String sql = "INSERT INTO scores (userName, usedTime) VALUES(?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, userName);
        statement.setLong(2, usedTime);

        System.out.println(statement.toString());
        statement.executeUpdate();
    }


    /**
     * Load scoresList from Db
     *
     * @throws SQLException
     */
    public void loadScoresFromDb() throws SQLException {
        this.connector.connect();
        this.scores = new ArrayList<>();
        Connection conn = this.connector.getConnection();
        String sql = "SELECT userName, usedTime FROM scores ORDER BY usedTime";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet results = statement.executeQuery();

        while (results.next()) {
            this.scores.add(new Score(results.getString("userName"), results.getLong("usedTime")));
        }


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
