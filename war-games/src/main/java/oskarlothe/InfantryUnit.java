package oskarlothe;

public class InfantryUnit extends Unit {
    private int attackBonus;
    private int resistBonus;

    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
        attackBonus = 2;
        resistBonus = 1;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getResistBonus() {
        return resistBonus;
    }
}
