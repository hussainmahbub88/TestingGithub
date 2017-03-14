package Encapsulation;

public class Game {
	public static void main(String[] args) {
		Player player = new Player();
		player.name = "Mohammad";
		player.health = 20;
		player.weapon = "Shot Gun";

		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining Helath = " + player.healthRemaining());

		damage = 200;
		player.health = 200;
		player.loseHealth(damage);
		System.out.println("Remaining Helath = " + player.healthRemaining());
	}

}
