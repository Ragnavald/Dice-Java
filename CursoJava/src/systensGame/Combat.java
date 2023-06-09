package systensGame;

public abstract class Combat extends Item{
	
	private double reach;	
	private double criticalChance;
	private double criticalDamage;
	private double criticalMultiplier;
	
	public double getReach() {
		return reach;
	}
	public void setReach(double reach) {
		this.reach = reach;
	}
	public double getCriticalChance() {
		return criticalChance;
	}
	public void setCriticalChance(double criticalChance) {
		this.criticalChance = criticalChance;
	}
	public double getCriticalDamage() {
		return criticalDamage;
	}
	public void setCriticalDamage(double criticalDamage) {
		this.criticalDamage = criticalDamage;
	}
	public double getCriticalMultiplier() {
		return criticalMultiplier;
	}
	public void setCriticalMultiplier(double criticalMultiplier) {
		this.criticalMultiplier = criticalMultiplier;
	}
	
	public abstract boolean attack(Player player);
	
}
