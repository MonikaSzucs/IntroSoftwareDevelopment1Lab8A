
/**
 * Write a description of class Canada here.
 *
 * @author Monika Szucs
 * @version November 3 2018
 */
public class Canada
{
    // instance variables - replace the example below with your own
    public static final int BC = 0;
    public static final int AB = 1;
    public static final int MB = 2;
    public static final int NB = 3;
    public static final int NL = 4;
    public static final int NT = 5;
    public static final int NS = 6;
    public static final int NU = 7;
    public static final int ON = 8;
    public static final int PE = 9;
    public static final int QC = 10;
    public static final int SK = 11;
    public static final int YT = 12;

    private ProvinceTerritory[] provinces;

    /**
     * Constructor for objects of class Canada
     */
    public Canada()
    {

        provinces = new ProvinceTerritory[13]; 

        provinces[BC]=new ProvinceTerritory("British Columbia",4400057);
        provinces[AB]=new ProvinceTerritory("Alberta",3645257);
        provinces[MB]=new ProvinceTerritory("Manitoba",1208268);
        provinces[NB]=new ProvinceTerritory("New Brunswick",751171);
        provinces[NL]=new ProvinceTerritory("Newfoundland and Labrador",514536);
        provinces[NT]=new ProvinceTerritory("Northwest Territories",41462);
        provinces[NS]=new ProvinceTerritory("Nova Scotia",921727);
        provinces[NU]=new ProvinceTerritory("Nunavut",31906);
        provinces[ON]=new ProvinceTerritory("Ontario",12851821);
        provinces[PE]=new ProvinceTerritory("Prince Edward Island",140204);
        provinces[QC]=new ProvinceTerritory("Quebec",7903001);
        provinces[SK]=new ProvinceTerritory("Saskatchewan",1033381);
        provinces[YT]=new ProvinceTerritory("Yukon",33897);

    }

    /**
     * Method
     * 
     * @return the sum
     */
    public int getTotalPopulation()
    {
        // put your code here
        int index = 0;
        int sum = 0;

        while(index<=provinces.length-1){
            sum+=provinces[index].getPopulation();
            index+=1;
        }

        return sum;
    }

    /**
     * Method
     * 
     * @return the Lowest population name
     */
    public String getLowestPopulation()
    {
        // put your code here
        int     index = 0;
        String  lowProvinceName = "";
        int     lowProvincePopulation = 13000000;

        while(index<=provinces.length-1){
            if(provinces[index].getPopulation()<lowProvincePopulation){
                lowProvinceName =  provinces[index].getName();
                lowProvincePopulation =  provinces[index].getPopulation();
            }

            index+=1;
        }

        return lowProvinceName;
    }

    /**
     * Method
     * 
     * @return province population 
     * @return a negative one if no such province
     */
    public int getPopulation(String province)
    {
        // put your code here
        int     NO_SUCH_PROVINCE = -1;
        int     index = 0;

        if(province != null && !province.equals("")){

            while(index<=provinces.length-1){
                if(provinces[index].getName().equals(province)){
                    return provinces[index].getPopulation();
                }
                index+=1;
            }

            return NO_SUCH_PROVINCE;
        }
        else {
            throw new IllegalArgumentException("Cannot be null or empty");
        }
    }
    
    /**
     * Method
     * 
     * @return matching provinces
     * @return if province with population between min and max
     */
    
    public String[] getProvincesWithPopulationBetween(int min, int max){
        int i                   = 0;
        int j                   = 0;
        int numOfProvWithPop    = 0;
        String[] matchingProvinces;

        while(i<provinces.length){
            if((provinces[i].getPopulation()>=min)&&(provinces[i].getPopulation()<=max)){
                numOfProvWithPop++;
            }
            i++;
        }

        if(numOfProvWithPop>0){
            matchingProvinces = new String[numOfProvWithPop];
        } else {
            //no matches
            return null;
        }

        i=0; //start lookin from the beginning again
        while(i<provinces.length){
            if((provinces[i].getPopulation()>=min)&&(provinces[i].getPopulation()<=max)){
                matchingProvinces[j]=provinces[i].getName();
                j++;
            }
            i++;
        }

        return matchingProvinces;
    }
    
    /**
     * Method
     * 
     * @return true if province found
     * @return false if province not found 
     */
    
    public boolean isProvinceInCanada(String name){
        int     index = 0;

        if(name != null && !name.equals("")){
            while(index<=provinces.length-1){
                if(provinces[index].getName().equals(name)){
                    return true;
                }
                index+=1;
            }

            return false;
        }else{
            throw new IllegalArgumentException("The province is not valid.");
        }
    }

    /**
     * Method
     * 
     * @return null if province name does not contain the substring
     * @return matchingProvinces if the substring matches a province 
     */
    
    public String[] getProvincesWhoseNameContains(String substring){
        int i = 0;
        int j = 0;
        int numOfProv = 0;

        String[] matchingProvinces;

        if(substring == null || substring.equals("")){
            throw new IllegalArgumentException("The parameter cannot be null or empty");
        }
        
        while(i < provinces.length){
            if(substring != null && !substring.equals("") && provinces[i].getName().toUpperCase().contains(substring.toUpperCase())){
                numOfProv++;
                System.out.println(numOfProv);
            }
            i++;
        }

        if(numOfProv>0){
            matchingProvinces = new String[numOfProv];
        } else {
            return null;
        }

        i = 0;
        while(i < provinces.length){
            if(substring != null && !substring.equals("") && provinces[i].getName().toUpperCase().contains(substring.toUpperCase())){
                matchingProvinces[j] = provinces[i].getName();
                j++;

            }
            i++;
        }

        return matchingProvinces;
    }      

    /**
     * Method
     * 
     * @return null if no province found from substring entered
     * @return provinceTerritories if substring found provinces matching 
     */
    public ProvinceTerritory[] getMoreProvincesWhoseNameContains(String substring){
        int i = 0;
        int j = 0;
        int numOfProv = 0;

        // String[] matchingProvinces;
        ProvinceTerritory[] provinceTerritories;

        if(substring == null || substring.equals("")){
            throw new IllegalArgumentException("The parameter cannot be null or empty");
        }
        
        while(i < provinces.length){
            if(substring != null && !substring.equals("") && provinces[i].getName().toUpperCase().contains(substring.toUpperCase())){
                numOfProv++;
            }
            i++;
        }

        if(numOfProv>0){
            // matchingProvinces = new String[numOfProv];
            provinceTerritories = new ProvinceTerritory[numOfProv];
        } else {
            return null;
        }

        i = 0;

        while(i < provinces.length){
            if(substring != null && !substring.equals("") && provinces[i].getName().toUpperCase().contains(substring.toUpperCase())){
                // matchingProvinces[j] = new String(provinces[i].getName());
                // System.out.println(matchingProvinces[j]);
                provinceTerritories[j] = provinces[i];
                j++;

            }
            i++;
        }

        return provinceTerritories;
    }

    /**
     * Method
     * 
     * @return null if no province found from character letter
     * @return matching provinces if letter entered finds a province that starts with the same letter
     */
    public String[] getProvincesWhoseNameStartsWith(char letter){
        int i = 0;
        int j = 0;
        int numOfProv = 0;

        String[] matchingProvinces;
        
        while(i < provinces.length){
            if(letter != '\0' && letter != ' ' && provinces[i].getName().toUpperCase().startsWith((String.valueOf(letter).toUpperCase()))){
                numOfProv++;
                System.out.println(numOfProv);
            }
            i++;
        }

        if(numOfProv>0){
            matchingProvinces = new String[numOfProv];
        } else {
            return null;
        }

        i = 0;
        while(i < provinces.length){
            if(letter != '\0' && letter != ' ' && provinces[i].getName().toUpperCase().startsWith((String.valueOf(letter).toUpperCase()))){
                matchingProvinces[j] = provinces[i].getName();
                System.out.println(matchingProvinces[j]);
                j++;

            }
            i++;
        }

        return matchingProvinces;

    }

}
