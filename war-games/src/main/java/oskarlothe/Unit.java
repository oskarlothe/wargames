package oskarlothe;

public abstract class Unit {
    private String name;
    private int health;
    private int attack;
    private int armor;

    public Unit(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getArmor() {
        return this.armor;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Unit opponent) {
        opponent.setHealth(opponent.health - (this.attack + this.getAttackBonus) + (opponent.armor + opponent.getResistBonus));
    }

    abstract int getAttackBonus();

    abstract int getResistBonus();
}
