/**
 * initialize unit data from file, all data would be in this ONE class(?). date 2-15
 * @author qi
 */

package unit;

public abstract class Unit implements UnitInterface {

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

	public void haichuan2b() {
		throw new UnsupportedOperationException();
	}

	protected int maxHeathPoint;
	protected int currentHeathPoint;
	
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

}
