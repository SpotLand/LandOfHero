package unitClient;

import unit.UnitFactory;
import unit.UnitInterface;
import unit.UnitModel;

public class Client {
	
	public Client() {
		
	}
	
	public static void main(String[] argv) {
		UnitModel zombiesUnit = UnitFactory.getUnit("zombies", "soldier");
		UnitModel marsUnit = UnitFactory.getUnit("mars", "soldier");
		
		out("zombies - soldier:");
		out("\tattack: " + zombiesUnit.getAttack());
		out("\tattack range:  " + zombiesUnit.getAttackRange());
		out("\tattribute: " + zombiesUnit.getAttribute());
		out("\tcourage: " + zombiesUnit.getCourage());
		out("\tcurrent health point: " + zombiesUnit.getCurrentHealthPoint());
		out("\tcurrent magic point: " + zombiesUnit.getCurrentMagicPoint());
		out("\texperience: " + zombiesUnit.getExperience());
		out("\tlevel: " + zombiesUnit.getLevel());
		out("\tmagic defence: " + zombiesUnit.getMagicDefence());
		out("\tmax health point: " + zombiesUnit.getMaxHealthPoint());
		out("\tmax magic point: " + zombiesUnit.getMaxMagicPoint());
		out("\tmove point: " + zombiesUnit.getMovePoint());
		out("\t physical defence: " + zombiesUnit.getPhysicalDefence());
	}

	private static void out(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

}
