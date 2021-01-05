package sample.be;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Movie {

    /**
     * This class is for getter and setter methods for instances of the Movie class.
     */

    private static final String PROP_FILE = "data/config.properties";

    private int id;
    private String title;
    private String category;
    private String path;
    private String duration;
    private double rating;
    private int lastView;

    public Movie(int id, String title, String category, String path, String duration, double rating, int lastView) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.path = path;
        this.duration = duration;
        this.rating = rating;
        this.lastView = lastView;
    }

    public int getID()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getPath() throws IOException {
        String url;
        Properties pathProperties = new Properties();
        FileInputStream ip = new FileInputStream(PROP_FILE);
        pathProperties.load(ip);
        url = pathProperties.getProperty("url");
        return url + path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String getDuration()
    {
        return duration;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    public double getRating()
    {
        return rating;
    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }

    public int getLastView()
    {
        return lastView;
    }
}
