package sample.bll;

import sample.be.Movie;

import java.util.List;

public interface logicfacade {

    /**
     * Gets a list of all songs.
     * @return a list of songs.
     */
    List<Movie> getAllMovies();

    /**
     * Adds a new movie.
     * @param name The name of the movie.
     * @param year The releaseyear.
     * @param duration The duration in minutes.
     * @param rating The rating on the movie.
     * @param filelink The link to the mp4 file.
     * @return A new movie.
     */
    Movie addMovie(String name, int year, int duration, double rating, String filelink);

    /**
     * Deletes a movie.
     * @param movie The movie to delete.
     */
    void deleteMovie(Movie movie);

    /**
     * Lets you edit or add a rating.
     * @param movie The movie that you want to add a new rating.
     * @return The movie with the new rating.
     */
    Movie editRating(Movie movie);



}
