
/**
 * Write a description of class ProvinceTerritory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProvinceTerritory
{
    // instance variables - replace the example below with your own
    private String  name;
    private int     population;

    /**
     * Constructor for objects of class ProvinceTerritory
     */
    public ProvinceTerritory(String name, int population)
    {
        // initialise instance variables
        setName(name);
        setPopulation(population);
    }

    /**
     * Acessor
     *
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * Mutator
     *
     */
    public void setName(String name)
    {
        if(name != null && !name.equals("")){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("The name cannot be empty or null");
        }
    }
    
    /**
     * Acessor
     *
     */
    public int getPopulation()
    {
        // put your code here
        return population;
    }
    
    /**
     * Mutator
     *
     */
    public void setPopulation(int population)
    {
        if(population>0){
            this.population = population;
        }
        else {
            throw new IllegalArgumentException("the population cannot be less than 0");
        }
    }
}
