package Encapsulation;

public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Alfie";
//        player.health = 20;
//        player.weapon = "bow and arrow";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial Health is "+ tim.healthRemaining());
    }
}
