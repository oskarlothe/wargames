package oskarlothe;

/**
 * The unit class is an abstract class used to make subclasses of different units.
 * It has four private fields simulating the units name, health, attack and armor.
 */
public abstract class Unit {
    private String name;
    private int health;
    private int attack;
    private int armor;

    public Unit(String name, int health, int attack, int armor) {
        this.name = name; // represents the name of the unit
        this.health = health; // represents the health of the unit
        this.attack = attack; // represents the attack damage of the unit
        this.armor = armor; // represents the armor of the unit
    }

    /**
     * Returns the given name of the unit object.
     * @return The name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the current health of the unit object.
     * @return The health
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Returns the attackdamage of the unit object.
     * @return The attackdamage
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * Returns the armor of the unit object.
     * @return The armor
     */
    public int getArmor() {
        return this.armor;
    }

    /**
     * Sets the health of a unit. Usefull for combat between units.
     * @param health An integer that represents the health of the unit
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Makes a unit attack another.
     * The formula calls the setHealth method on the given opponent, such as only the opponent will take damage.
     * @param opponent Another object of class Unit that will be the target for the attack
     */
    public void attack(Unit opponent) {
        opponent.setHealth(opponent.getHealth() - (this.attack + this.getAttackBonus()) + (opponent.getArmor() + opponent.getResistBonus()));
    }

    /**
     * An abstract method that will return the attackbonus of the unit based on a unique formula for that unit.
     * @return An integer that represents the attackbonus for the unit
     */
    abstract int getAttackBonus();

    /**
     * An abstract method that will return the resistbonus of the unit based on a unique formula for that unit.
     * @return An integer that represents the resistbonus for the unit
     */
    abstract int getResistBonus();

    /**
     * Overriding toString() method of String class
     */
    @Override
    public String toString() {
        return this.name + this.health + this.attack + this.armor;
    }
}
