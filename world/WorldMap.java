package world;

public class WorldMap {
    private final int width;
    private final int height;
    private final boolean[][] obstacles; // true if a wall/obstacle exists

    public WorldMap(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new boolean[width][height];
    }

    public boolean isClear(int x, int y) {
        // 1. Boundary check
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return false;
        }
        // 2. Obstacle check
        return !obstacles[x][y];
    }

    /**
     * Helper to manually add a wall for testing the FlexBot's logic.
     */
    public void addObstacle(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            obstacles[x][y] = true;
        }
    }

    /**
     * Simple console visualization of the map.
     */
    public void display() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(obstacles[x][y] ? "█" : ".");
            }
            System.out.println();
        }
    }
}
