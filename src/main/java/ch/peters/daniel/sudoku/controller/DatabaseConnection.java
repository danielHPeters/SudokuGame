package ch.peters.daniel.sudoku.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Daniel on 03.04.2017.
 */
public class DatabaseConnection {

    /**
     *
     */
    private Configuration config;

    /**
     *
     */
    private String link;

    /**
     *
     */
    private Connection conn;

    /**
     * @param config
     */
    public DatabaseConnection(Configuration config) {
        this.config = config;
        this.link = "jdbc:" + config.getDriver() + "://"
                + this.config.getHost()
                + ":" + this.config.getPort()
                + "/" + this.config.getDatabase();
    }

    /**
     * @throws SQLException
     */
    public void connect() throws SQLException {

        if (this.conn == null) {
            this.conn = DriverManager.getConnection(
                    link, this.config.getUser(), this.config.getPassword()
            );
        }
    }

    /**
     * @return
     */
    public Connection getConnection() throws NullPointerException {
        return this.conn;
    }

}
