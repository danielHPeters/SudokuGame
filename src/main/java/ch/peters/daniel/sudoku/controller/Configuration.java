package ch.peters.daniel.sudoku.controller;

/**
 * Database configuration data.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Configuration {
  private final String driver;
  private final String host;
  private final String database;
  private final String user;
  private final String password;
  private final int port;

  public Configuration(String driver, String host, String database, String user, String password, int port) {
    this.driver = driver;
    this.host = host;
    this.database = database;
    this.user = user;
    this.password = password;
    this.port = port;
  }

  public String getDriver() {
    return driver;
  }

  public String getHost() {
    return host;
  }

  public String getDatabase() {
    return database;
  }

  public String getUser() {
    return user;
  }

  public String getPassword() {
    return password;
  }

  public int getPort() {
    return port;
  }
}
