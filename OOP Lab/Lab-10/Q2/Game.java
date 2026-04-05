public class Game {
    public static void main(String[] args) {
        Warrior w = new Warrior("Conan", 100, 20);
        Mage m = new Mage("Gandalf", 80, 25);
        Archer a = new Archer("Legolas", 90, 18);

        w.specialAbility();
        m.specialAbility();
        a.specialAbility();

        System.out.println("\nBattle simulation:");
        w.attack(m);
        m.attack(a);
        a.attack(w);

        System.out.println("\nFinal health:");
        System.out.println(w.getName() + ": " + w.getHealth());
        System.out.println(m.getName() + ": " + m.getHealth());
        System.out.println(a.getName() + ": " + a.getHealth());
    }
}
