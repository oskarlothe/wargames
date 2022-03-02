package oskarlothe;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Army armyOne = new Army("Human army");
        Army armyTwo = new Army("Orchish horde");

        int target = 500;
        int count = 0;
        while (count < target) {
            armyOne.addUnit(new InfantryUnit("Footman", 100));
            count++;
        }

        

        target = 500;
        count = 0;
        while (count < target) {
            armyTwo.addUnit(new InfantryUnit("Grunt", 100));
            count++;
        }

        target = 100;
        count = 0;
        while (count < target) {
            armyOne.addUnit(new RangedUnit("Archer", 100));
            count++;
        }


        target = 100;
        count = 0;
        while (count < target) {
            armyTwo.addUnit(new RangedUnit("Spearman", 100));
            count++;
        }

        System.out.println(armyOne.getAllUnits().size());
        System.out.println(armyTwo.getAllUnits().size());

        Battle battle = new Battle(armyOne, armyTwo);


        System.out.println("Welcome to Wargames. Here you will observe an epic battle between two armies.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Click enter to continue...");
        sc.nextLine();
        Army result = battle.simulate();
        System.out.println(result.getName() + " has won the battle!");
    }
}
