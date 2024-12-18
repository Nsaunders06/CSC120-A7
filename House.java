import java.util.ArrayList; 

/* This is a stub for the House class */
public class House extends Building { // Extends the building class 
// Attributes 
    private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
    private boolean hasDiningRoom; // hasDiningRoom assess if the house has a dining room 

/**
 * Constructor for house 
 * @param name
 * @param address
 * @param nFloors
 * @param hasDiningRoom
 */
    public House ( String name, String address, int nFloors, Boolean hasDiningRoom) {
        super(name, address, nFloors);
        this.hasDiningRoom = hasDiningRoom; 
        this.residents = new ArrayList<String>(); 
        System.out.println("You have built a house: 🏠");
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

//Overriding
    public void showOptions() {
        super.showOptions();
        System.out.println("+ moveIn ()");
        System.out.println("+ moveOut ()");
        System.out.println("+ isResident()");
    }

    public void goToFloor (int floorNum){
        if (this.hasElevator ==false){ 
            if (activeFloor == 0){
                this.activeFloor = activeFloor + 2; 
            }
            else{
                this.activeFloor = activeFloor ++; 
            }
            System.out.println("you are on floor " + this.activeFloor);
        }
       else{
        super.goToFloor(floorNum);
        System.out.println("you are on floor " + this.activeFloor);
       }

        
    }
        public static void main(String[] args) {
          House capen = new House( "Capen", "26 prospect st", 3, false);
          System.out.println("You built a house at " + capen.address + ". It is " + capen.hasDiningRoom + " that there is a dining room in " + capen.name + " There are " + capen.residents.size() + " residents on the " + capen.nFloors + " floors. "); 
          capen.moveIn("Nina"); 
          capen.moveIn("Ada"); 
          System.out.println(capen.residents);
          capen.enter(); 
          capen.goToFloor(2); 
          capen.goToFloor(3); 
        }
      
      }
