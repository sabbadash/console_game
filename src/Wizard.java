public class Wizard extends Hero {

    public Wizard(String name, double healthPoint, double damage) {
        this.heroClass = "Wizard";
        this.name = name;
        this.healthPoint = healthPoint;
        this.damage = damage;
    }

    @Override
    public void attack(Hero player) {
        if (this.name.equals(player.getName())) {
            System.out.println(this.getName() + " tried to hit himself");
        } else {
            long randNum = Math.round(Math.random() * 3); //0, 1, 2
            if (randNum == 2) {
                player.decreaseHealthPoint(getDamage() * 1.15);
            } else {
                player.decreaseHealthPoint(getDamage());
            }
        }
    }
}
