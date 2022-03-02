package oskarlothe;

public class RangedUnit extends Unit {
    private int attackBonus;
    private int resistBonus;
    private int attackedCount;

    public RangedUnit(String name, int health) {
        super(name, health, 15, 8);
        this.attackBonus = 3;
        this.resistBonus = 6;
        this.attackedCount = 0;
    }

    public void setHealth(int health) {
        super.setHealth(health);
        if (this.attackedCount < 2) {
            this.attackedCount++;
        }
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getResistBonus() {
        return resistBonus - attackedCount * 2;
    }
}
