import java.util.ArrayList; 

/* This is a stub for the House class */
public class House extends Building { // Extends the building class 
// Attributes 
    private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
    private boolean hasDiningRoom; // hasDiningRoom assess if the house has a dining room 
    private boolean hasElevator; //hasElevator 

/**
 * Constructor for house 
 * @param name
 * @param address
 * @param nFloors
 * @param hasDiningRoom
 * @param hasElevator 
 */
    public House (String name, String address, int nFloors, Boolean hasDiningRoom, boolean hasElevator) {
        super(name, address, nFloors);
        this.hasDiningRoom = hasDiningRoom; 
        this.residents = new ArrayList<String>(); 
        this.hasElevator = hasElevator; 
        System.out.println("You have built a house: 🏠");
        }
/**
 * Overloaded constructor for house 
 * @param name
 * @param address
 * @param hasElevator
 */  
    public House (String name, String address, boolean hasElevator){
        super(name); 
        this.address = address; 
        this.hasElevator = hasElevator; 
    }
/**
 * Another overloaded constructor with minimum information 
 * @param name
 * @param adress
 */
    public House (String name, String adress){
        super (name, adress); 
    }

/**
 * Getter for hasDiningRoom 
 * @return hasDiningRoom 
 */
    //Getter for hasDiningRoom 
    public Boolean hasDiningRoom(){
        return this.hasDiningRoom;
    }
/**
 * Getter for nResidents 
 * @return nResidents 
 */
    //Getter for nResidents 
    public Integer nResidents(){
        return this.residents.size();
    }


/**
 * Allows you to move in a resident 
 * @param resident
 */
    public void moveIn(String resident) {
        if(residents.contains(resident)){
            throw new RuntimeException("Resident already lives there"); 
        }
        residents.add(resident);

    }
/**
 * Allows you to move out a resident 
 * @param resident
 */   
    public void moveOut(String resident) {
        if(!residents.contains(resident)){
            throw new RuntimeException("Resident does not live here"); 
        }
        residents.remove(resident); 
    }
/**
 * Checks if a resident is a resident of a said house 
 * @param resident
 * @return isResident 
 */
    public boolean isResident(String resident){
        return residents.contains(resident); 
    }

/**
 * Makes it so you can only see the options for the house class 
 */
    public void showOptions() {
        super.showOptions();
        System.out.println("+ moveIn ()");
        System.out.println("+ moveOut ()");
        System.out.println("+ isResident()");
    }
/**
 * Makes it so you can only move the correct number of levels, dependent on elevator status 
 */

    public void goToFloor (int floorNum){
        if (this.hasElevator ==false){ 
          throw new RuntimeException("You cannot use the goToFloor because there is no elevator. Try goUp or goDown. ");
        }
       else{
        super.goToFloor(floorNum);
       }
        
    }
    /**
     * Allows users to go up in the house without an elevator 
     */
    public void goUp(){
        this.activeFloor ++; 
        System.out.println("You are now on floor " + this.activeFloor);
    }

    public void goDown(){ 
        this.activeFloor --; 
        System.out.println("You are now on " + this.activeFloor);
    }

        public static void main(String[] args) {
          House capen = new House( "Capen", "26 prospect st", 3, false, false);
          System.out.println("You built a house at " + capen.address + ". It is " + capen.hasDiningRoom + " that there is a dining room in " + capen.name + " There are " + capen.residents.size() + " residents on the " + capen.nFloors + " floors. "); 
          capen.moveIn("Nina"); 
          capen.moveIn("Ada"); 
          System.out.println(capen.residents);
          capen.enter(); 
          capen.goUp(); 
          capen.goUp(); 
          capen.goToFloor(3); 
        
        }
      
      }
