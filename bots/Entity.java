package bots;

public abstract class Entity {
    private final String id;
    protected int x;
    protected int y;

    public Entity(String id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public String getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("%s at (%d, %d)", id, x, y);
    }
}
