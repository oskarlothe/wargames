package oskarlothe;

public class Battle {
    private Army armyOne;
    private Army armyTwo;

    public Battle(Army armyOne, Army armyTwo) {
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    public Army simulate() {
        while (this.armyOne.getAllUnits().size() > 0 && this.armyTwo.getAllUnits().size() > 0) {
            Unit unit1 = this.armyOne.getRandom();
            Unit unit2 = this.armyTwo.getRandom();

            unit1.attack(unit2);
            if (unit2.getHealth() <= 0) {
                this.armyTwo.remove(unit2);
            }

            unit2.attack(unit1);
            if (unit1.getHealth() <= 0) {
                this.armyOne.remove(unit1);
            }

            printActionDetails(unit1, unit2);
        }

        if (this.armyOne.getAllUnits().size() > this.armyTwo.getAllUnits().size()) {
            return this.armyOne;
        }
        return this.armyTwo;
    }

    public void printActionDetails(Unit unit1, Unit unit2) {
        System.out.println("Unit '" + unit1.getName() + "' has " + unit1.getHealth() + " health afther fighting with '" + unit2.getName() + "'");
        System.out.println("Unit '" + unit2.getName() + "' has " + unit2.getHealth() + " health afther fighting with '" + unit1.getName() + "'");
    }

    @Override
    public String toString() {
        return this.armyOne.getName() + this.armyTwo.getName();
    }
}
