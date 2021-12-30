package champion;

import java.util.ArrayList;
import java.util.List;

public class Champion {
    private final String Name;
    private final int Cost;
    private String[] Traits;

    /* Representation Invariant */
    //1 <= cost <= 5

    /* Abstraction Function */
    //AF(c) = a champion that costs c.cost() and has traits c.getTraits()

    /**
     * Create a new champion with specified name, traits and cost
     * @param name the name of the champion
     * @param traits the traits of the champion
     * @param cost the amount of gold needed to buy the champion
     */
    public Champion (String name, String[] traits, int cost) {
        Name = name;
        Cost = cost;
        Traits = traits;
    }

    public String getName() {
        return Name;
    }

    public int getCost() {
        return Cost;
    }
}
