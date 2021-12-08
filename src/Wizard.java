public class Wizard extends Hero {

    public Wizard(String name, int healthPoint, int damage) {
        this.heroClass = "Wizard";
        this.name = name;
        this.actualHealthPoint = healthPoint;
        this.initialDamage = damage;
        this.actualDamage = damage;
    }
}
