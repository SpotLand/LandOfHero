package unit;


public class UnitFactory {
	
	public UnitFactory() {
		
	}

	public static UnitModel getUnit(String race, String category) {
		// TODO Auto-generated method stub
		return new Unit(race, category);
	}
}
