package game_entity;

// --- DIVERSE CHILD 2: THE TURRET ---
public class Turret extends Entity {
    private float firingRange;
    private int ammoCount;

    public Turret(String id, float x, float y, float firingRange, int ammoCount) {
        super(id, x, y); // Pass shared data to parent
        this.firingRange = firingRange;
        this.ammoCount = ammoCount;
    }

    // Unique behavior for automated threats
    public void shootTarget(Entity target) {
        if (ammoCount > 0) {
            ammoCount--;
            System.out.println("Turret [" + id + "] fires at entity target! Ammo left: " + ammoCount);
        }
    }

    // METHOD OVERRIDING: Turrets scan for targets instead of floating
    @Override
    public void update(float deltaTime) {
        System.out.println("Turret [" + id + "] scanning radius " + firingRange + " for enemies.");
    }
}
