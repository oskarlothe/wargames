package oskarlothe;

public class CommanderUnit extends CavalryUnit {
    public CommanderUnit(String name, int health) {
        super(name, health);
        this.attack = 25;
        this.armor = 15;
    }
}
