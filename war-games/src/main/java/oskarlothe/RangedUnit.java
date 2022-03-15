package oskarlothe;

/**
 * A subclass of the superclass Unit.
 * The ranged unit is stronger on the first attacks.
 */
public class RangedUnit extends Unit {
    private int attackBonus; // represents the initial attack bonus of the unit
    private int resistBonus; // represents the initial resist bonus of the unit
    private int attackedCount; // counts the times the unit has been attacked
 
    /**
     * Creates an object of the class.
     * The ranged unit has an attack damage of 15 and an amor of 8.
     * @param name The name of the unit
     * @param health The initial health of the unit
     */
    public RangedUnit(String name, int health) {
        super(name, health, 15, 8);
        this.attackBonus = 3;
        this.resistBonus = 6;
        this.attackedCount = 0;
    }

    /**
     * Overrides the setHealth() method from Unit class in order to count the times the unit has been attacked.
     * @param health Sets a new health amount for the unit.
     */
    @Override
    public void setHealth(int health) {
        super.setHealth(health);
        if (this.attackedCount < 2) {
            this.attackedCount++;
        }
    }

    /**
     * Returns the attack bonus for the unit.
     * @return An integer representing the attack bonus.
     */
    @Override
    public int getAttackBonus() {
        return attackBonus;
    }

    /**
     * Returns the resist bonus based on a simple formula unique for this subclass unit.
     * This resist bonus will change according to the times the unit has been attacked.
     * @return An integer representing the current resist bonus.
     */
    @Override
    public int getResistBonus() {
        return resistBonus - attackedCount * 2;
    }
}
