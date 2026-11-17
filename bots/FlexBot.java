package bots;

import world.WorldMap;

public class FlexBot extends Bot {

    public FlexBot(String id, int x, int y, WorldMap map) {
        super(id, x, y, map);
    }

    @Override
    public int move(int distance) {
        // Attempt to move as far as possible
        int remaining = super.move(distance);

        // If there is movement left, it means we hit an obstacle
        if (remaining > 0) {
            System.out.println(getId() + " blocked with " + remaining + " steps left. Turning...");
            turnLeft();

            // Complete the remainder of the move in the new direction
            return super.move(remaining);
        }

        return 0; // All steps completed
    }
}
