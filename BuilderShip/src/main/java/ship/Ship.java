package ship;

public class Ship {
	
	private int damage;
	private int shield;
	private String name;
	
	public String getDamage(){
		return Integer.toString(damage);
	}
	
	public String getShield(){
		return Integer.toString(shield);
	}
	
	public String getName(){
		return name;
	}
	
	public void addDamage(int val){
		damage = val;
	}
	
	public void addShield(int val){
		shield = val;
	}
	
	public void setName(String newName){
		name = newName;
	}
}
