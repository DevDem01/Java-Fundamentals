package lab_4;

public class GameCharacter {
	private String name;
	private int health;
	

	
	public  GameCharacter( String name, int health) {
		this.health=health;
		this.name=name;
	
	}
	public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int attack() {
        return 10; 
    }

    public String getType() {
        return "Game Character";
    }

}
