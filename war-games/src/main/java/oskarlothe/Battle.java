package oskarlothe;

import java.util.Random;

/**
 * This class will simulate a battle between 2 distinct armies.
 * The two armies must be of Army object and must have at least one unit in it.
 */
public class Battle {
    private Army armyOne; // holds an object of class Army
    private Army armyTwo; // holds an object of class Army

    /**
     * Creates an instance of the class and assignes the two army variables
     * 
     * @param armyOne The first army in the battle
     * @param armyTwo The second army in the battle
     */
    public Battle(Army armyOne, Army armyTwo) {
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    /**
     * The first simulate method i wrote. Works but simulates the battle poorly.
     * 
     * @return The winner of the battle.
     */
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

    /**
     * The best simulate method written so far.
     * Assignes one attacker and one victim randomly to make the battle as random as
     * possible.
     * Only the victim is attacked each iteration of the while loop, making it so
     * that units from one army can attack the other army several times in a row
     * without being attack itself.
     * The simulation ends when one of the armies is defeated.
     * @return The army that won the battle
     */
    public Army simulate2() {
        while (this.armyOne.getAllUnits().size() > 0 && this.armyTwo.getAllUnits().size() > 0) {
            Army rdArmy; // the army that will execute the attack
            Army opp; // the army that will be attacked

            /**
             * A random army is chosen to attack while the other one will be the opponent
             */
            Random rd = new Random();
            if (rd.nextBoolean()) {
                rdArmy = this.armyOne;
                opp = this.armyTwo;
            } else {
                rdArmy = this.armyTwo;
                opp = this.armyOne;
            }

            /**
             * A random unit from each army is picked out
             */
            Unit unit1 = rdArmy.getRandom();
            Unit unit2 = opp.getRandom();

            /**
             * The chosen random unit will attack the opponent
             */
            unit1.attack(unit2);

            /**
             * If the attack opponent drops below 0 health it will be removed from its army
             */
            if (unit2.getHealth() < 0) {
                opp.remove(unit2);
            }

            /**
             * Prints out details about the attack
             */
            printActionDetails(unit1, unit2);
        }

        if (this.armyOne.getAllUnits().size() > this.armyTwo.getAllUnits().size()) {
            return this.armyOne;
        }
        return this.armyTwo;
    }

    /**
     * Prints out details about an attack where both units attack each other.
     * Poorly written and not used in the latest simulate method.
     * @param unit1 Unit from one of the armies
     * @param unit2 Unit from the other army
     */
    public void printActionDetails(Unit unit1, Unit unit2) {
        System.out.println("Unit '" + unit1.getName() + "' has " + unit1.getHealth() + " health afther fighting with '"
                + unit2.getName() + "'");
        System.out.println("Unit '" + unit2.getName() + "' has " + unit2.getHealth() + " health afther fighting with '"
                + unit1.getName() + "'");
    }

    /**
     * Prints out details about an attack.
     * @param attacker The unit that attacks
     * @param victim The unit that is being attacked
     */
    public void printActionDetails2(Unit attacker, Unit victim) {
        System.out.println("Unit '" + victim.getName() + "' has " + victim.getHealth() + " health afther attacked by '"
                + attacker.getName() + "'");
    }

    /**
     * Overrides the toString() method from Object class
     * @return Returns a string representation of the fields
     */
    @Override
    public String toString() {
        return this.armyOne.getName() + this.armyTwo.getName();
    }
}
