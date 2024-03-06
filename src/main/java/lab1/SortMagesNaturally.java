package lab1;

import java.util.Comparator;

public class SortMagesNaturally implements Comparator<Mage> {

    @Override
    public int compare(Mage m1, Mage m2) {

        int nameCompare = m1.getName().compareTo(m2.getName());
        int levelCompare = m1.getLevel().compareTo(m2.getLevel());
        int powerCompare = m1.getPower().compareTo(m2.getPower());

        return (nameCompare == 0) ? (levelCompare == 0) ? powerCompare : levelCompare : nameCompare;

    }

}
