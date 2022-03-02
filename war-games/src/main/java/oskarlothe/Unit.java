package oskarlothe;

public abstract class Unit {
    protected String name;
    protected int health;
    protected int attack;
    protected int armor;

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
        opponent.setHealth(opponent.getHealth() - (this.attack + this.getAttackBonus()) + (opponent.getArmor() + opponent.getResistBonus()));
    }

    abstract int getAttackBonus();

    abstract int getResistBonus();

    public String toString() {
        return this.name + this.health + this.attack + this.armor;
    }
}
