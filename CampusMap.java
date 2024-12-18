import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Sage Hall", "144 Green St, Northamption, MA 01063")); 
        myMap.addBuilding(new House("Talbot House", "25 Prospect St,  Northampton MA 01063", 4, false, false));
        myMap.addBuilding(new House("Lamont House", "17 Prospect St, Northampton MA 01063", true));
        myMap.addBuilding(new House("Cutter House", "10 Prospect St, Northampton, MA 01060"));
        myMap.addBuilding(new Library ("Neilson", "7 Neilson Drive, Northampton, MA 01063", 5, true));
        myMap.addBuilding(new Library("Hillyer Art Library", "22 Elm St, Northampton, MA 01063"));
        myMap.addBuilding(new Library("Alumnae Gymnasium", "83 Green Street, Northampton, MA 01063", 3 ));
        myMap.addBuilding(new Cafe("Campus Center Cafe", "100 Elm St, Northampton, MA 01063", 1, 64, 100, 100,100));
        myMap.addBuilding(new Cafe ("The Compass Cafe", "7 Neilson Drive, Northampton, MA 01063")); 
        myMap.addBuilding(new Cafe ("CutterZ Dining Hall", "10 Prospect St, Northampton MA 01063", 30, 50, 25,20));

        System.out.println(myMap);
    }
    
}
