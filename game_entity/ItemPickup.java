package game_entity;

// --- DIVERSE CHILD 1: THE ITEM PICKUP ---
public class ItemPickup extends Entity {
    private int pointValue;
    private String itemType;

    public ItemPickup(String id, float x, float y, int pointValue, String itemType) {
        super(id, x, y); // Pass shared data to parent
        this.pointValue = pointValue;
        this.itemType = itemType;
    }

    // Unique behavior for collectibles
    public void onPlayerCollide() {
        System.out.println("Player collected " + itemType + "! Awarded " + pointValue + " points.");

        // CALLING A PARENT METHOD IT DOESN'T OWN DIRECTLY:
        // ItemPickup doesn't define destroy(), but it inherits it seamlessly!
        this.destroy();
    }

    // METHOD OVERRIDING: Pickups have a visual bobbing animation
    @Override
    public void update(float deltaTime) {
        System.out.println("Item [" + id + "] is floating and sparkling at (" + x + ", " + y + ").");
    }
}

