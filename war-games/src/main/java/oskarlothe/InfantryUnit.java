package oskarlothe;

/**
 * A subclass of the superclass Unit.
 */
public class InfantryUnit extends Unit {
    private int attackBonus; // represents the attack bonus of the unit
    private int resistBonus; // represents the resist bonus of the unit

    /**
     * Creates an instance of the class.
     * 
     * @param name The name of the unit
     * @param health The initial health of the unit
     */
    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
        attackBonus = 2;
        resistBonus = 1;
    }

    @Override
    public int getAttackBonus() {
        return attackBonus;
    }

    /**
     * Returns the resist bonus.
     * 
     * @return An integer representing the resist bonus
     */
    @Override
    public int getResistBonus() {
        return resistBonus;
    }
}
