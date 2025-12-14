// Matthew Stettnisch Assignment 7

// (Code given)
public class App {

    public static class Enemy {
        int health;
        int damage;

        public Enemy(int h, int d) {
            health = h;
            damage = d;
        }

        void attack() {
            System.out.println("the enemy attacks");
        }
    } 
    // Goblin extends enemy allows the goblin to inherit the characteristcs of the parent enrmy,
    // but we will change the attack method to fit the goblin with @Override
    public static class Goblin extends Enemy {

        public Goblin(int h, int d) {
            super(h, d);
        }

        @Override
        void attack() {
            System.out.println("the goblin gobbles!");
        }
    }

    public static class Wizard extends Enemy {
        String type;

        public Wizard(int h, int d, String t) {
            super(h, d);
            type = t;
        }

        // Print out the given attack based upon if the input is "fire" or "Ice"
        void damageType() {
            if (type.equals("fire")) {
                System.out.println("this wizard shoots a fireball!");
            } else if (type.equals("ice")) {
                System.out.println("this wizard shoots an iceball!");
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Enemy enemy1 = new Enemy(59, 25);
        enemy1.attack();

        Wizard fireWizard = new Wizard(90, 18, "fire");
        fireWizard.attack();
        fireWizard.damageType();

        Wizard iceWizard = new Wizard(55, 10, "ice");
        iceWizard.attack();
        iceWizard.damageType();

        Goblin goblin1 = new Goblin(38, 10);
        goblin1.attack();

        /* 
        Practicaing inheritance and classes with the game aspect helps me understand it even better,
        the idea of characters in a game having given health and damge stats is intuitive to me which makes learning
        the code way easier.
        */
    }
}