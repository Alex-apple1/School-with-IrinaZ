package HomeTasks;

    public class Task7And8 {
        public static String declareWinner(
                Fighter fighter1,
                Fighter fighter2,
                String firstAttacker) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health -= fighter2.damagePerAttack;
                fighter2.health -= fighter1.damagePerAttack;

                if (fighter1.health <= 0 && fighter2.health <= 0) {
                    return firstAttacker;
                } else if (fighter1.health <= 0) {
                    return fighter2.name;
                } else {
                    return fighter1.name;
                }
            }
            fighter1.health -= fighter2.damagePerAttack;
            fighter2.health -= fighter1.damagePerAttack;

            if (fighter1.health <= 0 && fighter2.health <= 0) {
                return firstAttacker;
            } else if (fighter1.health <= 0) {
                return fighter2.name;
            } else {
                return fighter1.name;
            }
        }





        public static void main(String[] args) {
            System.out.println(
                    declareWinner(new Fighter("Lew", 10, 2),
                            new Fighter("Harry", 5, 4),
                            "Lew"));

        }

    }


