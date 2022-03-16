package oskarlothe;

import java.util.Scanner;

/**
 * This class initializes the application.
 * It creates new units and assignes them to an army, in order to simulate a battle betweem these two armies.
 */
public class App 
{
    /**
     * The main method that runs the application.
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        /**
         * Creates two different armies
         */
        Army armyOne = new Army("Human army");
        Army armyTwo = new Army("Orchish horde");

        /**
         * Adds 500 Infantry units to the first army
         */
        int target = 500;
        int count = 0;
        while (count < target) {
            armyOne.addUnit(new InfantryUnit("Footman", 100));
            count++;
        }

        
        /**
         * Adds 500 Infantry units to the second army
         */
        target = 500;
        count = 0;
        while (count < target) {
            armyTwo.addUnit(new InfantryUnit("Grunt", 100));
            count++;
        }

        /**
         * Adds 100 Ranged units to the first army
         */
        target = 100;
        count = 0;
        while (count < target) {
            armyOne.addUnit(new RangedUnit("Archer", 100));
            count++;
        }

        /**
         * Adds 100 Ranged units to the second army
         */
        target = 100;
        count = 0;
        while (count < target) {
            armyTwo.addUnit(new RangedUnit("Spearman", 100));
            count++;
        }

        /**
         * Prints details about each army.
         */
        System.out.println(armyOne.getAllUnits().size());
        System.out.println(armyTwo.getAllUnits().size());

        Battle battle = new Battle(armyOne, armyTwo);


        /**
         * Runs the simulation
         */
        System.out.println("Welcome to Wargames. Here you will observe an epic battle between two armies.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Click enter to continue...");
        sc.nextLine();
        Army result = battle.simulate2();
        System.out.println(result.getName() + " has won the battle!");
    }
}
