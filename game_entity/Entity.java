package game_entity;

// --- THE PARENT CLASS ---
public class Entity {
    protected String id;
    protected float x, y;
    protected boolean isActive;

    public Entity(String id, float x, float y) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.isActive = true;
    }

    // A method inherited by ALL entities without rewriting code
    public void destroy() {
        this.isActive = false;
        System.out.println("Entity [" + id + "] removed from world memory.");
    }

    public void update(float deltaTime) {
        // Base tick logic
    }
}

