public class Hero {

    protected String name;
    protected String heroClass;
    protected double healthPoint;
    protected double damage;

    public Hero(String name, double healthPoint, double damage) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.damage = damage;
    }

    public Hero() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeroClass() {
        return this.heroClass;
    }

    public double getHealthPoint() {
        return this.healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void decreaseHealthPoint(double healthPoint) {
        this.healthPoint -= healthPoint;
    }

    public void attack(Hero player) {
        if (this.name.equals(player.getName())) {
            System.out.println(this.getName() + " tried to hit himself");
        } else {
            player.decreaseHealthPoint(getDamage());
        }
    }

    public String getInfo() {
        return "Name: " + this.getName()
                + "\nClass: " + this.getHeroClass()
                + "\nHP: " + this.getHealthPoint()
                + "\nDamage: " + this.getDamage() + "\n\n";
    }
}
