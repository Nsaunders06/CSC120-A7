import java.util.Collection;
import java.util.Hashtable; 

/* This is a stub for the Library class */
public class Library extends Building { // Extends the Building class 

//Attributes 
private Hashtable<String, Boolean> collection; 
private boolean hasElevator;

/**
 * Constructor for Library 
 * @param name
 * @param address
 * @param nFloors
 * @param hasElevator 
 * @param collection
 */

    public Library (String name, String address, int nFloors, boolean hasElevator) {
        super(name, address, nFloors);
        this.hasElevator = hasElevator; 
        collection = new Hashtable<>(); 
        System.out.println("You have built a library: 📖");
    }


/**
 * Overloaded constructor with just name and address 
 * @param name
 * @param address
 */
    public Library (String name, String address){
        super (name, address); 
        System.out.println("You have built a library: 📖");
    }
/**
 * Overloaded constructor with only name, address and the number of floors 
 * @param name
 * @param address
 * @param nFloors
 */
    public Library (String name, String address, int nFloors){
        super(name, address, nFloors);
        System.out.println("You have built a library: 📖");
    }

//Methods 
/**
 * Adds title to collection if it is not already there 
 * @param title
 */
    public void addTitle(String title){
        if (this.collection.containsKey(title)) {
            throw new RuntimeException("We can't duplicate titles!"); 
        }
        this.collection.put(title, true); 
    }
/**
 * Remvoes title from collection as long as it already was there
 * @param title
 * @return title 
 */
    public String removeTitle(String title){
        if (!this.collection.containsKey(title)){
            throw new RuntimeException("This book is not in the collection!"); 
        }
        this.collection.remove(title); 
        return title; 
    }
/**
 * Allows user to check out a book which temporarly removes it from the collection 
 * @param title
 */
    public void checkOut(String title){ 
        if (!this.collection.containsKey(title)) {
            this.collection.replace(title, false); 
        }
        else {
            throw new RuntimeException("This book is already checked out!");    
        }
    }
/**
 * Allows user to return a book which will add a book back to the collection 
 * @param title
 */
    public void returnBook(String title){
        if (!this.collection.containsKey(title)) {
            throw new RuntimeException("This library Does Not Own That Book");
        }
        if(!collection.get(title)){
            throw new RuntimeException("The library owns the book, but it isn't checked out.");
        }
        this.collection.replace(title, true); 
    } 
/**
 * Checks if a book is in the library's collection 
 * @param title
 * @return collection.containsKey 
 */
        // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean containsTitle(String title){ 
        return this.collection.containsKey(title);
        } 
/**
 * Sees if the title is available 
 * @param title
 * @return collection.get(title)
 */
        // returns true if the title is currently available, false otherwise
    public boolean isAvailable(String title){
        return this.collection.get(title); 
        } 
/**
 * Prints out the collection 
 * @param title
 */
         // prints out the entire collection in an easy-to-read way (including checkout status)
    public void printCollection(String title){
        System.out.println(collection.entrySet());
        }

/**
 * Makes it so you can only see the options for the library class 
 */
        public void showOptions() {
            super.showOptions();
            System.out.println("+ addTitle ()");
            System.out.println("+ removeTitle ()");
            System.out.println("+ checkOut ()");
            System.out.println("+ returnBook ()");
            System.out.println("+ containsTitle ()");
            System.out.println("+ isAvailable ()");
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
     * Allows person to go up in the library without an elevator 
     */
    public void goUp(){
        this.activeFloor ++; 
        System.out.println("You are now on floor " + this.activeFloor);
    }
    /**
     * Allows person to go down in the library without an elevator 
     */
    public void goDown(){ 
        this.activeFloor --; 
        System.out.println("You are now on floor " + this.activeFloor);
    }

    public static void main(String[] args) {
        Library Nielson = new Library("Nielson", "Neilson Drive", 4, true);
        Nielson.enter();
    }
  }