/* This is a stub for the Cafe class */
public class Cafe extends Building { // Extends the Building class

    // Attributes 
        private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
        private int nSugarPackets; // The number of sugar packets remaining in inventory
        private int nCreams; // The number of "splashes" of cream remaining in inventory
        private int nCups; // The number of cups remaining in inventory
    /**
     * Constructor for cafe 
     * @param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
        public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
            super(name, address, nFloors);
            this.nCoffeeOunces = nCoffeeOunces; 
            this.nSugarPackets = nSugarPackets; 
            this.nCreams = nCreams; 
            this.nCups = nCups; 
            System.out.println("You have built a cafe: ☕");
        }
        
    /**
     * Allows cafe to restock 
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
        private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) { 
            this.nCoffeeOunces = nCoffeeOunces+ nCoffeeOunces; 
            this.nSugarPackets = nSugarPackets + nSugarPackets; 
            this.nCreams = nCreams + nCreams; 
            this.nCups = nCups + nCups; 
        }
    /**
     * Allows cafe to sell coffee 
     * @param size
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
        public void sellCoffee(int size, int nSugarPackets, int nCreams, int nCups){
            if (nCoffeeOunces < size | nSugarPackets < nSugarPackets | nCreams < nCreams | nCups < nCups){
            restock(size, nSugarPackets, nCreams, nCups);   
            }
            this.nCoffeeOunces = nCoffeeOunces - size; 
            this.nSugarPackets = nSugarPackets - nSugarPackets; 
            this.nCreams = nCreams - nCreams; 
            this.nCups = nCups - 1;    
            
           
        }

 //Overriding
    public void showOptions() {
        super.showOptions();
        System.out.println("+ sellCoffee ()");
    }
  

    public static void main(String[] args) {
        Cafe CC = new Cafe("CC", "CC", 3, 10, 1, 1, 1);
        CC.restock(100, 100, 100, 100); 
    }
    
}
