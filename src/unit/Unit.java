/**
 * initialize unit data from file, all data would be in this ONE class(?). date 2-15
 * @author qi
 */

package unit;



public abstract class Unit implements UnitInterface {

	public Unit() {
		// TODO Auto-generated constructor stub
	}

	private int maxHeathPoint;
	private int currentHeathPoint;
	private int maxMagicPoint;
	private int currentMagicPoint;
	private int movePoint;
	private int attackRange;
	private int physicalDefence;
	private int attack;
	private int magicDefence;
	private int courage;
	private int experience;
	private int level;
	private int attribute;

}
