public class Hero {

    protected String name;
    protected String heroClass;
    protected int initialHealthPoint;
    protected int actualHealthPoint;
    protected int initialDamage;
    protected int actualDamage;

    public Hero(String name, int healthPoint, int damage) {
        this.name = name;
        this.initialHealthPoint = healthPoint;
        this.actualHealthPoint = healthPoint;
        this.initialDamage = damage;
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

    public int getActualHealthPoint() {
        return this.actualHealthPoint;
    }

    public void setActualHealthPoint(int healthPoint) {
        this.actualHealthPoint = healthPoint;
    }

    public int getInitialHealthPoint() {
        return this.initialHealthPoint;
    }

    public int getActualDamage() {
        return this.actualDamage;
    }

    public void setActualDamage(int damage) {
        this.actualDamage = damage;
    }

    public int getInitialDamage() {
        return this.initialDamage;
    }

    public void decreaseHealthPoint(int healthPoint) {
        this.actualHealthPoint -= healthPoint;
    }

    public boolean isAlive() {
        if (this.getActualHealthPoint() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void attack(Hero player) {
        if (this.getHeroClass().equals("Wizard")) {
            int randNum = (int) Math.round(Math.random() * 3);   //0, 1, 2
            if (randNum == 2) {
                this.setActualDamage(this.getActualDamage() + 3);
            }
        }

        if (this.name.equals(player.getName())) {
            System.out.println(this.getName() + " tried to hit himself");
        } else {
            System.out.print(this.getName() + "(HP:" + this.getActualHealthPoint() + ")"
                    + " hit " + player.getName() + "(HP:" + player.getActualHealthPoint() + ") -" + this.getActualDamage());
            if (this.getActualDamage() == this.getInitialDamage() && this.getHeroClass().equals("Wizard")) {
                System.out.println();
            } else {
                System.out.println(Methods.makeRed("\t!!MAGIC IMPACT!!"));
            }
            player.decreaseHealthPoint(this.getActualDamage());
            this.setActualDamage(this.getInitialDamage());
        }
    }

    public String getInfo() {
        return "Name: " + this.getName()
                + "\nClass: " + this.getHeroClass()
                + "\nHP: " + this.getActualHealthPoint()
                + "\nDamage: " + this.getActualDamage() + "\n\n";
    }
}
