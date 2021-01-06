package sample.dal.db;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import sample.be.Movie;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CatMovDAO {

    private final JDBCConnectionPool connectionPool;

    public CatMovDAO() throws IOException, SQLServerException {
        connectionPool = JDBCConnectionPool.getInstance();
    }

    public List<Movie> getallCatmovie() throws SQLException {
        List<Movie> allCatmovies = new ArrayList<>();
        Connection con = connectionPool.checkOut();

        try (Statement statement = con.createStatement()) {
            ResultSet rs = statement.executeQuery("SELECT * FROM CatMovie INNER JOIN Movie ON CatMovie.MovieId = Movie.MovieId");
            while (rs.next()) {


                Movie movie = new Movie(rs.getInt("MovieId"), rs.getString("Name"), rs.getInt("Year"), rs.getString("Path"), rs.getInt("Duration"), rs.getFloat("Rating"), rs.getInt("LastView"));
                allCatmovies.add(movie);

            }
        }
        return allCatmovies;
    }
}
