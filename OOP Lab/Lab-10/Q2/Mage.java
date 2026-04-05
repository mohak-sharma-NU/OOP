public class Mage extends Character {

    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public void specialAbility() {
        attackPower += (int)(attackPower * 0.2);
        System.out.println(name + " uses Mage special: attack power increased to " + attackPower);
    }
}
