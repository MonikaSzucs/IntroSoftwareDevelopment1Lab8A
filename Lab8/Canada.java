
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
     * 
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
     * 
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
     * 
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
}
