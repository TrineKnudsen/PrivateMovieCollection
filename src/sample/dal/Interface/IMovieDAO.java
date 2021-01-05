package sample.dal.Interface;

import sample.be.Movie;

import java.util.List;

public interface IMovieDAO {

    /**
     * Adds a movie in the database.
     *
     * @param name The name of the movie
     * @param rating The rating of the movie
     * @param filelink The name of the mp4 file.
     * @param duration The duration of the movie in minutes.
     * @return a movie object.
     */
    Movie addMovie(String name, double rating, int filelink, String duration);

    /**
     * Deletes a movie from the database.
     * @param movie The movie to delete.
     */
    void deleteMovie(Movie movie);

    /**
     * Gets a list of all the movies from the database.
     * @return A list of movies.
     */
    List<Movie> getAllMovies();

    /**
     * Gets a movie with the given ID.
     * @param id The ID of the chosen movie.
     * @return The movie the chosen ID.
     */
    Movie getMovie(int id);

    /**
     * Lets you edit or add a rating on a movie from the database.
     *
     * @param movie The movie with the updated or added rating.
     */
    void editRating(Movie movie);
}
