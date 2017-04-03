package sudokugame.controller;

/**
 * Created by Daniel on 03.04.2017.
 */
public class DbConfig {

    /**
     *
     */
    private String driver;

    /**
     *
     */
    private String host;

    /**
     *
     */
    private String database;

    /**
     *
     */
    private String user;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String port;

    /**
     *
     * @param driver
     * @param host
     * @param database
     * @param user
     * @param password
     * @param port
     */
    public DbConfig(String driver, String host, String database, String user, String password, String port){
        this.driver = driver;
        this.host = host;
        this.database = database;
        this.user = user;
        this.password = password;
        this.port = port;
    }

    /**
     *
     * @return
     */
    public String getDriver() {
        return driver;
    }

    /**
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     *
     * @return
     */
    public String getDatabase() {
        return database;
    }

    /**
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getPort() {
        return port;
    }
}
