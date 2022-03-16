package oskarlothe;

/**
 * A subclass of the superclass Unit.
 * The cavalry unit has does more damage on the first attack
 */
public class CavalryUnit extends Unit {
    private int attackBonus; // represents the attack bonus of the unit
    private int resistBonus; // represents the resist bonus of the unit
    private boolean hasAttacked; // keeps track if the unit has attacked yey

    /**
     * Creates an instance of the class.
     * The cavalry unit has an attack damage of 20 and an armor of 12.
     * 
     * @param name The name of the unit
     * @param health The initial health of the unit
     */
    public CavalryUnit(String name, int health) {
        super(name, health, 20, 12);
        this.attackBonus = 2;
        this.resistBonus = 1;
        this.hasAttacked = false;
    }

    /**
     * An alternative constructor which allows two more parameters.
     * Used by the subclass CommanderUnit for instance.
     * 
     * @param name The name of the unit
     * @param health The initial health of the unit
     * @param attack The attack damage of the unit
     * @param armor The armor of the unit
     */
    public CavalryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    @Override
    public void attack(Unit opponent) {
        super.attack(opponent);
        this.hasAttacked = true;
    }

    /**
     * Overrides the getAttackBonus() method of class Unit in order to return a unique attack bonus for this unit.
     * 
     * @return The current attack bonus for the unit
     */
    public int getAttackBonus() {
        if (hasAttacked) {
            return attackBonus;
        } else {
            return attackBonus + 4;
        }
    }

    /**
     * Returns the resist bonus for the unit.
     * 
     * @return The resist bonus
     */
    public int getResistBonus() {
        return resistBonus;
    }
}
