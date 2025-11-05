public class Die {

import java.util.Random;

public class Die {
   // Instance variable
    private int sides;
    private Random random;

    // Constructor — creates a die with the given number of sides
    public Die(int sides) {
        if (sides < 2) {
            throw new IllegalArgumentException("A die must have at least 2 sides.");
        }
        this.sides = sides;
        this.random = new Random();
    }

    // Returns the number of sides on the die
    public int getSides() {
        return sides;
    }

    // Rolls the die — returns a random integer in [1..sides]
    public int roll() {
        return random.nextInt(sides) + 1;
    }

    // String representation
    @Override
    public String toString() {
        return "Die with " + sides + " sides";
    }  
}


