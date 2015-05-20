package Enemy;

import Map.TileType;

public enum EnemyType{
	
	Bandits(50,3,10, "res/Bandits.png"), 
	DrBoom(70,7,7, "res/Link.png"), 
	Alvin(25,1,1, "res/HealthBar-Empty.png"),
	Pepe(42,69,0, "res/Player.png"),
	Link(45,2,14, "res/Link.png"), 
	Friedland(100,1,10, "res/HealthBar-Full.png")
	;
	
	
	private double currentHealth;
	private double totalHealth;
	private double cooldown;
	private double damage;
	private String loc;
	
	EnemyType(double totalHealth,double cooldown,double damage, String loc){
		this.cooldown = cooldown;
		this.damage = damage;
		this.totalHealth = totalHealth;
		this.currentHealth = totalHealth;
		this.loc = loc;
	}
	
	public TileType tileType(){
		TileType type = TileType.EMPTY;
		type.setTile(loc, true);
		return type;
	}

	public double getCurrentHealth() {return currentHealth;}
	public double getTotalHealth() {return totalHealth;}
	public double getCooldown() {return cooldown;}
	public double getDamage() {return damage;}
	public String getLocation() {return loc;}
}
