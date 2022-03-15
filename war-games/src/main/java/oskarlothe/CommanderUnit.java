package oskarlothe;

/**
 * A subclass of the superclass CavalryUnit.
 * The commander unit is a stronger version of the cavalry unit.
 */
public class CommanderUnit extends CavalryUnit {

    /**
     * Creates an instance of the class.
     * @param name The name of the unit
     * @param health The initial health of the unit
     */
    public CommanderUnit(String name, int health) {
        super(name, health, 25, 15);
    }
}
