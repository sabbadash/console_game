public class Hero {

    protected String name;
    protected String heroClass;
    protected double initialHealthPoint;
    protected double actualHealthPoint;
    protected double initialDamage;
    protected double actualDamage;

    //изменить метод getHealthPoint, и создать переменную для стартового хп, чтобы сравнивать действительное и стартовое

    public Hero(String name, double healthPoint, double damage) {
        this.name = name;
        this.initialHealthPoint = healthPoint;
        this.actualHealthPoint = healthPoint;
        this.actualDamage = damage;
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

    public double getActualHealthPoint() {
        return this.actualHealthPoint;
    }

    public void setActualHealthPoint(double healthPoint) {
        this.actualHealthPoint = healthPoint;
    }

    public double getInitialHealthPoint() {
        return this.initialHealthPoint;
    }

    public double getActualDamage() {
        return this.actualDamage;
    }

    public void setActualDamage(double damage) {
        this.actualDamage = damage;
    }

    public double getInitialDamage() {
        return this.initialDamage;
    }

    public void decreaseHealthPoint(double healthPoint) {
        this.actualHealthPoint -= healthPoint;
    }

    public boolean isAlive() {
        if (this.getActualHealthPoint() > 0.0d) {
            return true;
        } else {
            return false;
        }
    }

    public void attack(Hero player) {
        if (this.name.equals(player.getName())) {
            System.out.println(this.getName() + " tried to hit himself");
        } else {
            System.out.println(this.getName() + "(HP:" + this.getActualHealthPoint() + ")"
                    + " hit " + player.getName() + "(HP:" + player.getActualHealthPoint() + ") -" + this.getActualDamage());
            player.decreaseHealthPoint(getActualDamage());

        }
    }

    public String getInfo() {
        return "Name: " + this.getName()
                + "\nClass: " + this.getHeroClass()
                + "\nHP: " + this.getActualHealthPoint()
                + "\nDamage: " + this.getActualDamage() + "\n\n";
    }
}
