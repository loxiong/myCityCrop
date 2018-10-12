/*
 * The main() class filed for the CropData in cityOfAaron 
 * Ching Lo
 * CIT 260-08
 * Week 04 - My Individual Assignment
 * CropData Class
 */
package mycitycrop;
import model.*;
/**
 *
 * @author Ching Lo
 */
public class MyCityCrop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CropData class instantiated by Lo
        CropData myCropData = new CropData();
        
//values set up for testing
        myCropData.setYear(1830);
        myCropData.setPopulation(3724);
        myCropData.setAcresOwned(5000);
        myCropData.setCropYield(700);
        myCropData.setWheatInStore(2700);
        myCropData.setNumberWhoDied(5);
        myCropData.setNewPeople(75);
        myCropData.setHarvest(300);
        myCropData.setWheatForFood(200);
        myCropData.setAcresPlanted(500);
        
//testing the class
        System.out.println("The City of Aaron was founded in " + myCropData.getYear()
        + ". Our population was " + myCropData.getPopulation() 
	+ ". At that time, we owned " + myCropData.getAcresOwned() 
	+ " acres of land. Crop yield was " + myCropData.getCropYield() 
	+ " and the total number of bushels of wheat in store was " + myCropData.getWheatInStore() 
	+ ". We lost " + myCropData.getNumberWhoDied() 
        + " dear friends, and we welcomed " + myCropData.getNewPeople() 
	+ " new people. We were blessed with an abundance of harvest, which amounted to " + myCropData.getHarvest() 
        + " bushels of wheat, and brought forth " + myCropData.getWheatForFood() 
        + " pounds of wheat for food. For next year's harvest, we will plan to plant on " + myCropData.getAcresPlanned() 
        + " acres of land.");
    }
    
}
