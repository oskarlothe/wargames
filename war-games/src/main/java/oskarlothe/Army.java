package oskarlothe;

import java.util.ArrayList;
import java.util.Random;

/**
 * Creates army that contains an arraylist of multiple units.
 * Can be used by the battle class to simulate a batlle between armies.
 */
public class Army {
    private String name; // the name of the army
    private ArrayList<Unit> units; // an arraylist holding all the units of the army

    /**
     * Creates an instance of the class.
     * Instantly creates an empty arraylist that can hold instances of Unit class.
     * 
     * @param name The name of the army
     */
    public Army(String name) {
        this.name = name;
        this.units = new ArrayList<>();
    }

    /**
     * Returns the name of the army.
     * 
     * @return The name of the army
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns all the units of the army in order for other objects to get this
     * information.
     * 
     * @return The arraylist of the army
     */
    public ArrayList<Unit> getAllUnits() {
        return this.units;
    }

    /**
     * Adds a unit to the army.
     * Note that this method does not create a new instance of a Unit, but rather
     * adds an existing one to the arraylist.
     * 
     * @param unit The unit that will be put into the army
     */
    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    /**
     * Adds a whole arraylist of units to the army.
     * Convenient for merging two armies together to one.
     * 
     * @param units An arraylist containing objects of class Unit
     */
    public void addAll(ArrayList<Unit> units) {
        for (Unit unit : units) {
            this.units.add(unit);
        }
    }

    /**
     * Removes a spesific unit from the army.
     * 
     * @param unit The specified Unit that is wished removed
     */
    public void remove(Unit unit) {
        this.units.remove(unit);
    }

    /**
     * Checks whether the army current has any units.
     * 
     * @return True if unit(s) exists
     */
    public boolean hasUnits() {
        if (this.units.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * Returns a random unit from the army as long as any currently exists.
     * Returns null if no unit is found.
     * 
     * @return A random unit from the arraylist
     */
    public Unit getRandom() {
        if (this.hasUnits()) {
            Random rand = new Random();
            return this.units.get(rand.nextInt(this.units.size()));
        }
        return null;
    }

    /**
     * Overrides the toString() method from Object class.
     * 
     * @return Object to string
     */
    @Override
    public String toString() {
        return this.name + this.units;
    }

    /**
     * Overrides the equals() method from Object class.
     * 
     * @param o The object that is wished to be compared
     * @return True if the object matches to this one
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Army)) {
            return false;
        }
        Army army = (Army) o;

        return army.name.equals(name) &&
                army.units == units;
    }

    /**
     * Overrides the hashCode() method from Object class.
     * 
     * @return An integer representing the hashCode for this instance
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + units.hashCode();
        return result;
    }
}
