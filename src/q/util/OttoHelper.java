package q.util;

import com.squareup.otto.Bus;

public final class OttoHelper {

	private static Bus BUS;
	
	public static final Bus get(){
		if(BUS == null){
			BUS = new Bus();
		}
		return BUS;
	}
	
	private OttoHelper(){}
}
