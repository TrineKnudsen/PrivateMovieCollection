package sample.dal.db;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class MyDBConnector {

    private SQLServerDataSource dataSource;

    private static final String PROP_FILE = "src/sample/dal/database.settings.txt";
    private SQLServerDataSource ds;

    public MyDBConnector() throws IOException {
        Properties databaseProperties = new Properties();
        databaseProperties.load(new FileInputStream(new File(PROP_FILE)));

        String server = databaseProperties.getProperty("server");
        String database = databaseProperties.getProperty("database");
        String user = databaseProperties.getProperty("user");
        String password = databaseProperties.getProperty("password");

        ds = new SQLServerDataSource();
        ds.setServerName(server);
        ds.setDatabaseName(database);
        ds.setUser(user);
        ds.setPassword(password);
    }

    public Connection getConnection() throws SQLServerException {
        return ds.getConnection();
    }

    public static void main(String[]args) throws IOException, SQLException {
        MyDBConnector databaseConnector = new MyDBConnector();
        Connection connection = databaseConnector.getConnection();

        System.out.println("Is it open? " + !connection.isClosed());

        connection.close();
    }
}
