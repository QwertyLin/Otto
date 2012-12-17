package q.util;

import com.squareup.otto.Bus;

public final class EventHelper {

	private static Bus BUS;
	
	public static final Bus get(){
		if(BUS == null){
			BUS = new Bus();
		}
		return BUS;
	}
	
	private EventHelper(){}
}
