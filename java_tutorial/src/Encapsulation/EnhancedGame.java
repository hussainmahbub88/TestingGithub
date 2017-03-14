package Encapsulation;

public class EnhancedGame {

	public static void main(String[] args) {
		EnhancedPlayer player = new EnhancedPlayer("Mohamad", 200, "Shot Gun");
		System.out.println("Initial health is " + player.getHealth());
		player.loseHealth(30);
		System.out.println("updated health is " + player.getHealth());

	}

}
