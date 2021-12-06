public class Wizard extends Hero {

    public Wizard(String name, double healthPoint, double damage) {
        this.heroClass = "Wizard";
        this.name = name;
        this.actualHealthPoint = healthPoint;
        this.initialDamage = damage;
        this.actualDamage = damage;
    }

    @Override
    public void attack(Hero player) {
        long randNum = Math.round(Math.random() * 3); //0, 1, 2
        if (randNum == 2) {
            System.out.println("old:" + this.getActualDamage());
            this.setActualDamage(this.getActualDamage() * 1.15);
            System.out.println("new:" + this.getActualDamage());
        }

        if (this.name.equals(player.getName())) {
            System.out.println(this.getName() + " tried to hit himself");
            this.setActualDamage(this.getInitialDamage());
        } else {
                player.decreaseHealthPoint(this.getActualDamage());
                this.setActualDamage(this.getInitialDamage());
        }
    }
}
