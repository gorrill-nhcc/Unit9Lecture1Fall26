package world;

public enum Direction {
    NORTH(0, -1),
    EAST(1, 0),
    SOUTH(0, 1),
    WEST(-1, 0);

    public final int dx;
    public final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    // Utility to "Turn Left" by cycling through the enum
    public Direction previous() {
        int nextIndex = (this.ordinal() + 3) % 4; // Moves counter-clockwise
        return Direction.values()[nextIndex];
    }
}
