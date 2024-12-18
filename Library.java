import java.util.Collection;
import java.util.Hashtable; 

/* This is a stub for the Library class */
public class Library extends Building { // Extends the Building class 

//Attributes 
private Hashtable<String, Boolean> collection; 
/**
 * Constructor for Library 
 * @param name
 * @param address
 * @param nFloors
 * @param collection
 */

    public Library (String name, String address, int nFloors, Hashtable<String, Boolean > collection) {
        super(name, address, nFloors);
        collection = new Hashtable<>(); 
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

     //Overriding
        public void showOptions() {
            super.showOptions();
            System.out.println("+ addTitle ()");
            System.out.println("+ removeTitle ()");
            System.out.println("+ checkOut ()");
            System.out.println("+ returnBook ()");
            System.out.println("+ containsTitle ()");
            System.out.println("+ isAvailable ()");
        }

        public void goToFloor (int floorNum){
        super.goToFloor(floorNum);
        System.out.println("you are on floor " + this.activeFloor);
        }

    public static void main(String[] args) {
      Library Nielson = new Library("Nielson", "Neilson Drive", 4, null);
      
    }
  
  }