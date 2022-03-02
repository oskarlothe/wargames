package oskarlothe;

import java.util.ArrayList;
import java.util.Random;

public class Army {
    private String name;
    private ArrayList<Unit> units;

    public Army(String name) {
        this.name = name;
        this.units = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Unit> getAllUnits() {
        return this.units;
    }

    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    public void addAll(ArrayList<Unit> units) {
        for (Unit unit : units) {
            this.units.add(unit);
        }
    }

    public void remove(Unit unit) {
        this.units.remove(unit);
    }

    public boolean hasUnits() {
        if (this.units.size() > 0) {
            return true;
        }
        return false;
    }

    public Unit getRandom() {
        Random rand = new Random();
        return this.units.get(rand.nextInt(this.units.size()));
    }

    @Override
    public String toString() {
        return this.name + this.units;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Army)) {
            return false;
        }
        Army army = (Army) o;

        return army.name.equals(name) &&
                army.units == units;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + units.hashCode();
        return result;
    }
}
