package unitClient;

import unit.UnitFactory;
import unit.UnitInterface;

public class Client {
	
	public Client() {
		UnitInterface unit = UnitFactory.getUnit();
	}

}
