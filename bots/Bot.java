package bots;

import world.Direction;
import world.WorldMap;

public class Bot extends Entity {
    protected WorldMap map;
    protected Direction direction; // Assume an Enum: NORTH, EAST, SOUTH, WEST

    public Bot(String id, int x, int y, WorldMap map) {
        super(id, x, y); // Pass state up to Entity
        this.map = map;
        this.direction = Direction.NORTH;
    }

    public void turnLeft() {
        this.direction = this.direction.previous(); // Logic to cycle enum
        System.out.println(getId() + " turned to face " + direction);
    }

    /**
     * Moves step-by-step. Stops if blocked.
     * 
     * @return The number of steps NOT completed (0 if successful).
     */
    public int move(int distance) {
        int remaining = distance;

        while (remaining > 0) {
            int nextX = x + direction.dx;
            int nextY = y + direction.dy;

            if (map.isClear(nextX, nextY)) {
                this.x = nextX;
                this.y = nextY;
                remaining--;
            } else {
                // Path is blocked; stop moving
                break;
            }
        }
        return remaining; // Returns how much movement was "left on the table"
    }

    @Override
    public String toString() {
        return super.toString() + " facing " + direction;
    }
}
