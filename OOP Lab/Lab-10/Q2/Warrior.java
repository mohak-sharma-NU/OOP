public class Warrior extends Character {

    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public void specialAbility() {
        attackPower *= 2;
        System.out.println(name + " uses Warrior special: attack power doubled to " + attackPower);
    }
}
