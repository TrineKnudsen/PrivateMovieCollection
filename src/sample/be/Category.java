package sample.be;

public class Category {

    /**
     * This class is for getter and setter methods for the category object.
     */

    private int id;
    private String name;

    public Category(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
