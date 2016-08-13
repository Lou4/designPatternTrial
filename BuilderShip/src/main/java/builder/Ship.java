package builder;

public class Ship {
	
	int damage;
	int shield;
	int spy;
	String name;
	
	public String getDamage(){
		return Integer.toString(damage);
	}
	
	public String getShield(){
		return Integer.toString(shield);
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", damage: " + damage + ", shield: " + shield + ", spy: " + spy;
	}
}
