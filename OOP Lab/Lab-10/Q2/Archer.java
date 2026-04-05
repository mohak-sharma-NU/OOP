public class Archer extends Character {

    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public void specialAbility() {
        attackPower += (int)(attackPower * 0.15);
        System.out.println(name + " uses Archer special: attack power increased to " + attackPower);
    }
}
