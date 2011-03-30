/**
 * initialize unit data from file, all data would be in this ONE class(?). date 2-15
 * @by qi
 */

package unit;

import fileSystem.FileSystemInterface;
import fileSystem.UnitFileReader;


public class UnitModel implements UnitInterface {
	
	protected String race;
	protected String category;
	
	protected int maxHealthPoint;
	protected int currentHealthPoint;
	
	protected int maxMagicPoint;
	protected int currentMagicPoint;
	
	protected int movePoint;
	protected int attackRange;
	protected int physicalDefence;
	protected int attack;
	protected int magicDefence;
	protected int courage;
	protected int experience;
	protected int level;
	protected int attribute;	
	
	public UnitModel() {
		
	}
	
	public UnitModel(String race, String category) {
		loadData(race, category);
	}

	private void loadData(String race, String category) {
		// TODO Auto-generated method stub
		FileSystemInterface file = new UnitFileReader();
		
		this.race = race;
		this.category = category;
		
		try {
			setMaxHealthPoint(Integer.parseInt(file.get(race, category, "maxHealthPoint")));
			setMaxMagicPoint(Integer.parseInt(file.get(race, category, "maxMagicPoint")));
			
			setMovePoint(Integer.parseInt(file.get(race, category, "movePoint")));
			setAttackRange(Integer.parseInt(file.get(race, category, "attackRange")));
			setPhysicalDefence(Integer.parseInt(file.get(race, category, "physicalDefence")));
			setAttack(Integer.parseInt(file.get(race, category, "attack")));
			setMagicDefence(Integer.parseInt(file.get(race, category, "magicDefence")));
			setCourage(Integer.parseInt(file.get(race, category, "courage")));
			setExperience(Integer.parseInt(file.get(race, category, "experience")));
			setLevel(Integer.parseInt(file.get(race, category, "level")));
			setAttribute(Integer.parseInt(file.get(race, category, "attribute")));
		}
		catch(Exception e) {
			//TODO
		}
		
	}

	public int getMaxHealthPoint() {
		return maxHealthPoint;
	}

	public void setMaxHealthPoint(int maxHeathPoint) {
		this.maxHealthPoint = maxHeathPoint;
	}

	public int getCurrentHealthPoint() {
		return currentHealthPoint;
	}

	public void setCurrentHealthPoint(int currentHeathPoint) {
		this.currentHealthPoint = currentHeathPoint;
	}

	public int getMaxMagicPoint() {
		return maxMagicPoint;
	}

	public void setMaxMagicPoint(int maxMagicPoint) {
		this.maxMagicPoint = maxMagicPoint;
	}

	public int getCurrentMagicPoint() {
		return currentMagicPoint;
	}

	public void setCurrentMagicPoint(int currentMagicPoint) {
		this.currentMagicPoint = currentMagicPoint;
	}

	public int getMovePoint() {
		return movePoint;
	}

	public void setMovePoint(int movePoint) {
		this.movePoint = movePoint;
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}

	public int getPhysicalDefence() {
		return physicalDefence;
	}

	public void setPhysicalDefence(int physicalDefence) {
		this.physicalDefence = physicalDefence;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getMagicDefence() {
		return magicDefence;
	}

	public void setMagicDefence(int magicDefence) {
		this.magicDefence = magicDefence;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAttribute() {
		return attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

	protected void changeTheHeathyPoint() {
		throw new UnsupportedOperationException();
	}
	protected void changeTheMagicPoint() {
		throw new UnsupportedOperationException();
	}
	protected void changeTheMovePoint() {
		throw new UnsupportedOperationException();
	}

	public void getGrid() {
		throw new UnsupportedOperationException();
	}

	public void setGrid() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void standby() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buffFix() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heroFix() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terrainFix() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTerrainMoveCost() {
		// TODO Auto-generated method stub
		
	}

}
