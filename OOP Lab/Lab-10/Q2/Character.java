public abstract class Character {
    protected int health;
    protected int attackPower;
    protected String name;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void specialAbility();

    public void attack(Character target) {
        target.health -= this.attackPower;
        System.out.println(name + " attacks " + target.name + "! " + target.name + " health now: " + target.health);
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getName() {
        return name;
    }
}
