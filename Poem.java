/**
 * Class:Poem.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.2
 * @written on:11/04/2024
 * Course:ITEC 2150-01
 * This class is give to us to use for exercise 5.12.2 and 5.12.3  but the basic of class is to created object for the poems like name and the poet
 * */
package Ch5Hw;

public class Poem
{

    private String name;
    private String poet;

    /**
     * no-arg constructor
     */
    public Poem()
    {
        // initialize attributes
        name = "unknown";
        poet = "unknown";
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the poet
     */
    public String getPoet()
    {
        return poet;
    }

    /**
     * @param poet the poet to set
     */
    public void setPoet(String poet)
    {
        this.poet = poet;
    }

    @Override
    public String toString()
    {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }

}